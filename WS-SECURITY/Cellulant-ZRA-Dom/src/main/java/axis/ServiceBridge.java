package axis;

import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.context.ConfigurationContextFactory;
import org.apache.neethi.Policy;
import org.apache.neethi.PolicyEngine;
import org.apache.rampart.RampartMessageData;
import service.BankStatementNotificationServiceStub;
import service.EODPaymentNotificationReportServiceStub;
import service.PaymentNotificationServiceStub;
import service.PaymentRegistrationNumberLookupServiceStub;


import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.util.Properties;

/**
 * Created by Tim Mayabi on 15/01/2015.
 */
public class ServiceBridge {

    String _repo = null; //@todo Move to external configuration file
    String _axis2 = null; //@todo Move to external configuration  file
    String _policyFile = null; //@todo Move to external configuration  file

    Properties _prop = new Properties();
    String _propFileName = "config.properties";

    ConfigurationContext _ctx = null;

    public ServiceBridge() throws IOException {
        //Load Properties File
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(_propFileName);

        if (inputStream != null) {
            _prop.load(inputStream);
        } else {
            throw new FileNotFoundException("property file '" + _propFileName + "' not found in the classpath");
        }
        //Assign core properties
        _repo = _prop.getProperty("axisRepositoryFolder");
        _axis2 = _prop.getProperty("axisConfigFile");
        _policyFile = _prop.getProperty("rampantPolicyFile");

        _ctx = ConfigurationContextFactory.createConfigurationContextFromFileSystem(_repo, _axis2);
    }

    public PaymentRegistrationNumberLookupServiceStub.LookupPRNResponse LookupPRN(PaymentRegistrationNumberLookupServiceStub.LookupPRN PRNDetails)
    {

        service.PaymentRegistrationNumberLookupServiceStub.LookupPRNResponse details = null;

        try {
            PaymentRegistrationNumberLookupServiceStub stub = new PaymentRegistrationNumberLookupServiceStub(_ctx);
            _attachPolicy(stub);//
            details = stub.lookupPRN(PRNDetails); //Call ZRA
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return details;
    }

    /**
     * Send electronic bank statement for ZRA domestic tax account to ZRA
     *
     * @param statement
     * @return
     */
    public  service.BankStatementNotificationServiceStub.ProcessConsolidatedStatementResponse processBankStatement(service.BankStatementNotificationServiceStub.ProcessConsolidatedStatement statement)
    {
        service.BankStatementNotificationServiceStub.ProcessConsolidatedStatementResponse resp = null;

        try
        {
            BankStatementNotificationServiceStub stub = new BankStatementNotificationServiceStub(_ctx);
            _attachPolicy(stub);
            resp = stub.processConsolidatedStatement(statement);
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return resp;
    }

    /**
     * Send end of day report to ZRA
     * Contains all transactions that occurred the previous day
     *
     * @param report
     * @return
     */
    public  service.EODPaymentNotificationReportServiceStub.ProcessPaymentNotificationReportResponse processEODReport(service.EODPaymentNotificationReportServiceStub.ProcessPaymentNotificationReport report)
    {
        service.EODPaymentNotificationReportServiceStub.ProcessPaymentNotificationReportResponse resp = null;
        try
        {
            EODPaymentNotificationReportServiceStub stub = new EODPaymentNotificationReportServiceStub(_ctx);
            _attachPolicy(stub);
            resp = stub.processPaymentNotificationReport(report);
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return resp;
    }

    /**
     * Notify ZRA of successful payment
     * @param notification
     * @return
     */
    public  service.PaymentNotificationServiceStub.NotifyPaymentResponse notifyPayment(service.PaymentNotificationServiceStub.NotifyPayment notification)
    {
        service.PaymentNotificationServiceStub.NotifyPaymentResponse resp = null;
        try
        {
            PaymentNotificationServiceStub stub = new PaymentNotificationServiceStub(_ctx);
            _attachPolicy(stub);
            resp = stub.notifyPayment(notification);
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return resp;
    }

    /**
     * Attach signature and encryption policy to the service
     * Requires Rampant module
     *
     * @param stub
     */
    private void _attachPolicy (org.apache.axis2.client.Stub stub)
    {
        try {
            ServiceClient client = stub._getServiceClient();
            Options clientOptions = client.getOptions();

            Policy _policy= loadPolicy(_policyFile);

            clientOptions.setProperty(RampartMessageData.KEY_RAMPART_POLICY, _policy);


            client.setOptions(clientOptions);
            client.engageModule("addressing");
            client.engageModule("rampart");

            stub._setServiceClient(client);
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }

    private Policy loadPolicy(String filePath)
            throws XMLStreamException, FileNotFoundException {
        StAXOMBuilder builder = new StAXOMBuilder(filePath);
        return PolicyEngine.getPolicy(builder.getDocumentElement());
    }
}
