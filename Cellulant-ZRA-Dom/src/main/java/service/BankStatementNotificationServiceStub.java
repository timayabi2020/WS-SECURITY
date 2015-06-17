
/**
 * BankStatementNotificationServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package service;

        

        /*
        *  BankStatementNotificationServiceStub java implementation
        */

        
        public class BankStatementNotificationServiceStub extends org.apache.axis2.client.Stub
        {
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("BankStatementNotificationService" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[1];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://service.bank.pmt.zra", "processConsolidatedStatement"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         


    }

    /**
      *Constructor that takes in a configContext
      */

    public BankStatementNotificationServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public BankStatementNotificationServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public BankStatementNotificationServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"http://localhost:3306/ZraWebService/services/BankStatementNotificationService.BankStatementNotificationServiceHttpSoap11Endpoint/" );
                
    }

    /**
     * Default Constructor
     */
    public BankStatementNotificationServiceStub() throws org.apache.axis2.AxisFault {
        
                    this("http://localhost:3306/ZraWebService/services/BankStatementNotificationService.BankStatementNotificationServiceHttpSoap11Endpoint/" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public BankStatementNotificationServiceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see service.BankStatementNotificationService#processConsolidatedStatement
                     * @param processConsolidatedStatement0
                    
                     */

                    

                            public  service.BankStatementNotificationServiceStub.ProcessConsolidatedStatementResponse processConsolidatedStatement(

                            service.BankStatementNotificationServiceStub.ProcessConsolidatedStatement processConsolidatedStatement0)
                        

                    throws java.rmi.RemoteException
                    
                    {
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("urn:processConsolidatedStatement");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    processConsolidatedStatement0,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.bank.pmt.zra",
                                                    "processConsolidatedStatement")), new javax.xml.namespace.QName("http://service.bank.pmt.zra",
                                                    "processConsolidatedStatement"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             service.BankStatementNotificationServiceStub.ProcessConsolidatedStatementResponse.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (service.BankStatementNotificationServiceStub.ProcessConsolidatedStatementResponse)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"processConsolidatedStatement"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"processConsolidatedStatement"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"processConsolidatedStatement"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                /**
                * Auto generated method signature for Asynchronous Invocations
                * 
                * @see service.BankStatementNotificationService#startprocessConsolidatedStatement
                    * @param processConsolidatedStatement0
                
                */
                public  void startprocessConsolidatedStatement(

                 service.BankStatementNotificationServiceStub.ProcessConsolidatedStatement processConsolidatedStatement0,

                  final service.BankStatementNotificationServiceCallbackHandler callback)

                throws java.rmi.RemoteException{

              org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
             _operationClient.getOptions().setAction("urn:processConsolidatedStatement");
             _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              


              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env=null;
              final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

                    
                                    //Style is Doc.
                                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    processConsolidatedStatement0,
                                                    optimizeContent(new javax.xml.namespace.QName("http://service.bank.pmt.zra",
                                                    "processConsolidatedStatement")), new javax.xml.namespace.QName("http://service.bank.pmt.zra",
                                                    "processConsolidatedStatement"));
                                                
        // adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


                    
                        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
                            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                            try {
                                org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                                
                                        java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                                                                         service.BankStatementNotificationServiceStub.ProcessConsolidatedStatementResponse.class,
                                                                         getEnvelopeNamespaces(resultEnv));
                                        callback.receiveResultprocessConsolidatedStatement(
                                        (service.BankStatementNotificationServiceStub.ProcessConsolidatedStatementResponse)object);
                                        
                            } catch (org.apache.axis2.AxisFault e) {
                                callback.receiveErrorprocessConsolidatedStatement(e);
                            }
                            }

                            public void onError(java.lang.Exception error) {
								if (error instanceof org.apache.axis2.AxisFault) {
									org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
									org.apache.axiom.om.OMElement faultElt = f.getDetail();
									if (faultElt!=null){
										if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"processConsolidatedStatement"))){
											//make the fault by reflection
											try{
													java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"processConsolidatedStatement"));
													java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
													java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                                                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
													//message class
													java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"processConsolidatedStatement"));
														java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
													java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
													java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
															new java.lang.Class[]{messageClass});
													m.invoke(ex,new java.lang.Object[]{messageObject});
													
					
										            callback.receiveErrorprocessConsolidatedStatement(new java.rmi.RemoteException(ex.getMessage(), ex));
                                            } catch(java.lang.ClassCastException e){
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorprocessConsolidatedStatement(f);
                                            } catch (java.lang.ClassNotFoundException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorprocessConsolidatedStatement(f);
                                            } catch (java.lang.NoSuchMethodException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorprocessConsolidatedStatement(f);
                                            } catch (java.lang.reflect.InvocationTargetException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorprocessConsolidatedStatement(f);
                                            } catch (java.lang.IllegalAccessException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorprocessConsolidatedStatement(f);
                                            } catch (java.lang.InstantiationException e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorprocessConsolidatedStatement(f);
                                            } catch (org.apache.axis2.AxisFault e) {
                                                // we cannot intantiate the class - throw the original Axis fault
                                                callback.receiveErrorprocessConsolidatedStatement(f);
                                            }
									    } else {
										    callback.receiveErrorprocessConsolidatedStatement(f);
									    }
									} else {
									    callback.receiveErrorprocessConsolidatedStatement(f);
									}
								} else {
								    callback.receiveErrorprocessConsolidatedStatement(error);
								}
                            }

                            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                                onError(fault);
                            }

                            public void onComplete() {
                                try {
                                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                                } catch (org.apache.axis2.AxisFault axisFault) {
                                    callback.receiveErrorprocessConsolidatedStatement(axisFault);
                                }
                            }
                });
                        

          org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if ( _operations[0].getMessageReceiver()==null &&  _operationClient.getOptions().isUseSeparateListener()) {
           _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
          _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

           //execute the operation client
           _operationClient.execute(false);

                    }
                


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //http://10.16.76.69:9999/ZraWebService/services/BankStatementNotificationService.BankStatementNotificationServiceHttpSoap11Endpoint/
        public static class WebPmtNotifyConsolidatedDtls
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = WebPmtNotifyConsolidatedDtls
                Namespace URI = http://bean.bank.pmt.zra/xsd
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for AccNameHdr
                        */

                        
                                    protected java.lang.String localAccNameHdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccNameHdrTracker = false ;

                           public boolean isAccNameHdrSpecified(){
                               return localAccNameHdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAccNameHdr(){
                               return localAccNameHdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AccNameHdr
                               */
                               public void setAccNameHdr(java.lang.String param){
                            localAccNameHdrTracker = true;
                                   
                                            this.localAccNameHdr=param;
                                    

                               }
                            

                        /**
                        * field for AccNoHdr
                        */

                        
                                    protected java.lang.String localAccNoHdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccNoHdrTracker = false ;

                           public boolean isAccNoHdrSpecified(){
                               return localAccNoHdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAccNoHdr(){
                               return localAccNoHdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AccNoHdr
                               */
                               public void setAccNoHdr(java.lang.String param){
                            localAccNoHdrTracker = true;
                                   
                                            this.localAccNoHdr=param;
                                    

                               }
                            

                        /**
                        * field for AckErrFlagHdr
                        */

                        
                                    protected java.lang.String localAckErrFlagHdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAckErrFlagHdrTracker = false ;

                           public boolean isAckErrFlagHdrSpecified(){
                               return localAckErrFlagHdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAckErrFlagHdr(){
                               return localAckErrFlagHdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AckErrFlagHdr
                               */
                               public void setAckErrFlagHdr(java.lang.String param){
                            localAckErrFlagHdrTracker = true;
                                   
                                            this.localAckErrFlagHdr=param;
                                    

                               }
                            

                        /**
                        * field for AckSentHttpHdr
                        */

                        
                                    protected java.lang.String localAckSentHttpHdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAckSentHttpHdrTracker = false ;

                           public boolean isAckSentHttpHdrSpecified(){
                               return localAckSentHttpHdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAckSentHttpHdr(){
                               return localAckSentHttpHdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AckSentHttpHdr
                               */
                               public void setAckSentHttpHdr(java.lang.String param){
                            localAckSentHttpHdrTracker = true;
                                   
                                            this.localAckSentHttpHdr=param;
                                    

                               }
                            

                        /**
                        * field for BalanceRow
                        */

                        
                                    protected java.lang.String localBalanceRow ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBalanceRowTracker = false ;

                           public boolean isBalanceRowSpecified(){
                               return localBalanceRowTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBalanceRow(){
                               return localBalanceRow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BalanceRow
                               */
                               public void setBalanceRow(java.lang.String param){
                            localBalanceRowTracker = true;
                                   
                                            this.localBalanceRow=param;
                                    

                               }
                            

                        /**
                        * field for BankCodeHdr
                        */

                        
                                    protected java.lang.String localBankCodeHdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBankCodeHdrTracker = false ;

                           public boolean isBankCodeHdrSpecified(){
                               return localBankCodeHdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBankCodeHdr(){
                               return localBankCodeHdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BankCodeHdr
                               */
                               public void setBankCodeHdr(java.lang.String param){
                            localBankCodeHdrTracker = true;
                                   
                                            this.localBankCodeHdr=param;
                                    

                               }
                            

                        /**
                        * field for BankIdHdr
                        */

                        
                                    protected java.lang.String localBankIdHdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBankIdHdrTracker = false ;

                           public boolean isBankIdHdrSpecified(){
                               return localBankIdHdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBankIdHdr(){
                               return localBankIdHdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BankIdHdr
                               */
                               public void setBankIdHdr(java.lang.String param){
                            localBankIdHdrTracker = true;
                                   
                                            this.localBankIdHdr=param;
                                    

                               }
                            

                        /**
                        * field for BranchNoHdr
                        */

                        
                                    protected java.lang.String localBranchNoHdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBranchNoHdrTracker = false ;

                           public boolean isBranchNoHdrSpecified(){
                               return localBranchNoHdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBranchNoHdr(){
                               return localBranchNoHdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BranchNoHdr
                               */
                               public void setBranchNoHdr(java.lang.String param){
                            localBranchNoHdrTracker = true;
                                   
                                            this.localBranchNoHdr=param;
                                    

                               }
                            

                        /**
                        * field for ChequeNoRow
                        */

                        
                                    protected java.lang.String localChequeNoRow ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localChequeNoRowTracker = false ;

                           public boolean isChequeNoRowSpecified(){
                               return localChequeNoRowTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getChequeNoRow(){
                               return localChequeNoRow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ChequeNoRow
                               */
                               public void setChequeNoRow(java.lang.String param){
                            localChequeNoRowTracker = true;
                                   
                                            this.localChequeNoRow=param;
                                    

                               }
                            

                        /**
                        * field for ClosingBalHdr
                        */

                        
                                    protected java.lang.String localClosingBalHdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClosingBalHdrTracker = false ;

                           public boolean isClosingBalHdrSpecified(){
                               return localClosingBalHdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getClosingBalHdr(){
                               return localClosingBalHdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClosingBalHdr
                               */
                               public void setClosingBalHdr(java.lang.String param){
                            localClosingBalHdrTracker = true;
                                   
                                            this.localClosingBalHdr=param;
                                    

                               }
                            

                        /**
                        * field for CreditRow
                        */

                        
                                    protected java.lang.String localCreditRow ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreditRowTracker = false ;

                           public boolean isCreditRowSpecified(){
                               return localCreditRowTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCreditRow(){
                               return localCreditRow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreditRow
                               */
                               public void setCreditRow(java.lang.String param){
                            localCreditRowTracker = true;
                                   
                                            this.localCreditRow=param;
                                    

                               }
                            

                        /**
                        * field for DebitRow
                        */

                        
                                    protected java.lang.String localDebitRow ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDebitRowTracker = false ;

                           public boolean isDebitRowSpecified(){
                               return localDebitRowTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDebitRow(){
                               return localDebitRow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DebitRow
                               */
                               public void setDebitRow(java.lang.String param){
                            localDebitRowTracker = true;
                                   
                                            this.localDebitRow=param;
                                    

                               }
                            

                        /**
                        * field for DescriptionRow
                        */

                        
                                    protected java.lang.String localDescriptionRow ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDescriptionRowTracker = false ;

                           public boolean isDescriptionRowSpecified(){
                               return localDescriptionRowTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDescriptionRow(){
                               return localDescriptionRow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DescriptionRow
                               */
                               public void setDescriptionRow(java.lang.String param){
                            localDescriptionRowTracker = true;
                                   
                                            this.localDescriptionRow=param;
                                    

                               }
                            

                        /**
                        * field for DishoneredReasonRow
                        */

                        
                                    protected java.lang.String localDishoneredReasonRow ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDishoneredReasonRowTracker = false ;

                           public boolean isDishoneredReasonRowSpecified(){
                               return localDishoneredReasonRowTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDishoneredReasonRow(){
                               return localDishoneredReasonRow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DishoneredReasonRow
                               */
                               public void setDishoneredReasonRow(java.lang.String param){
                            localDishoneredReasonRowTracker = true;
                                   
                                            this.localDishoneredReasonRow=param;
                                    

                               }
                            

                        /**
                        * field for ErrorDescHdr
                        */

                        
                                    protected java.lang.String localErrorDescHdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorDescHdrTracker = false ;

                           public boolean isErrorDescHdrSpecified(){
                               return localErrorDescHdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getErrorDescHdr(){
                               return localErrorDescHdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorDescHdr
                               */
                               public void setErrorDescHdr(java.lang.String param){
                            localErrorDescHdrTracker = true;
                                   
                                            this.localErrorDescHdr=param;
                                    

                               }
                            

                        /**
                        * field for ExpryDateRow
                        */

                        
                                    protected java.lang.String localExpryDateRow ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExpryDateRowTracker = false ;

                           public boolean isExpryDateRowSpecified(){
                               return localExpryDateRowTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getExpryDateRow(){
                               return localExpryDateRow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ExpryDateRow
                               */
                               public void setExpryDateRow(java.lang.String param){
                            localExpryDateRowTracker = true;
                                   
                                            this.localExpryDateRow=param;
                                    

                               }
                            

                        /**
                        * field for FileModifyDateHdr
                        */

                        
                                    protected java.lang.String localFileModifyDateHdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFileModifyDateHdrTracker = false ;

                           public boolean isFileModifyDateHdrSpecified(){
                               return localFileModifyDateHdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFileModifyDateHdr(){
                               return localFileModifyDateHdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FileModifyDateHdr
                               */
                               public void setFileModifyDateHdr(java.lang.String param){
                            localFileModifyDateHdrTracker = true;
                                   
                                            this.localFileModifyDateHdr=param;
                                    

                               }
                            

                        /**
                        * field for FileTypeHdr
                        */

                        
                                    protected java.lang.String localFileTypeHdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFileTypeHdrTracker = false ;

                           public boolean isFileTypeHdrSpecified(){
                               return localFileTypeHdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getFileTypeHdr(){
                               return localFileTypeHdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FileTypeHdr
                               */
                               public void setFileTypeHdr(java.lang.String param){
                            localFileTypeHdrTracker = true;
                                   
                                            this.localFileTypeHdr=param;
                                    

                               }
                            

                        /**
                        * field for ManualUploadHdr
                        */

                        
                                    protected java.lang.String localManualUploadHdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localManualUploadHdrTracker = false ;

                           public boolean isManualUploadHdrSpecified(){
                               return localManualUploadHdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getManualUploadHdr(){
                               return localManualUploadHdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ManualUploadHdr
                               */
                               public void setManualUploadHdr(java.lang.String param){
                            localManualUploadHdrTracker = true;
                                   
                                            this.localManualUploadHdr=param;
                                    

                               }
                            

                        /**
                        * field for OpeningBalHdr
                        */

                        
                                    protected java.lang.String localOpeningBalHdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOpeningBalHdrTracker = false ;

                           public boolean isOpeningBalHdrSpecified(){
                               return localOpeningBalHdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOpeningBalHdr(){
                               return localOpeningBalHdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OpeningBalHdr
                               */
                               public void setOpeningBalHdr(java.lang.String param){
                            localOpeningBalHdrTracker = true;
                                   
                                            this.localOpeningBalHdr=param;
                                    

                               }
                            

                        /**
                        * field for PrnRow
                        */

                        
                                    protected java.lang.String localPrnRow ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrnRowTracker = false ;

                           public boolean isPrnRowSpecified(){
                               return localPrnRowTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPrnRow(){
                               return localPrnRow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrnRow
                               */
                               public void setPrnRow(java.lang.String param){
                            localPrnRowTracker = true;
                                   
                                            this.localPrnRow=param;
                                    

                               }
                            

                        /**
                        * field for ReceiveDateHdr
                        */

                        
                                    protected java.lang.String localReceiveDateHdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReceiveDateHdrTracker = false ;

                           public boolean isReceiveDateHdrSpecified(){
                               return localReceiveDateHdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReceiveDateHdr(){
                               return localReceiveDateHdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReceiveDateHdr
                               */
                               public void setReceiveDateHdr(java.lang.String param){
                            localReceiveDateHdrTracker = true;
                                   
                                            this.localReceiveDateHdr=param;
                                    

                               }
                            

                        /**
                        * field for StmtDateHdr
                        */

                        
                                    protected java.lang.String localStmtDateHdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStmtDateHdrTracker = false ;

                           public boolean isStmtDateHdrSpecified(){
                               return localStmtDateHdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStmtDateHdr(){
                               return localStmtDateHdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StmtDateHdr
                               */
                               public void setStmtDateHdr(java.lang.String param){
                            localStmtDateHdrTracker = true;
                                   
                                            this.localStmtDateHdr=param;
                                    

                               }
                            

                        /**
                        * field for StmtNoHdr
                        */

                        
                                    protected java.lang.String localStmtNoHdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStmtNoHdrTracker = false ;

                           public boolean isStmtNoHdrSpecified(){
                               return localStmtNoHdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStmtNoHdr(){
                               return localStmtNoHdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StmtNoHdr
                               */
                               public void setStmtNoHdr(java.lang.String param){
                            localStmtNoHdrTracker = true;
                                   
                                            this.localStmtNoHdr=param;
                                    

                               }
                            

                        /**
                        * field for TaxpayerNameRow
                        */

                        
                                    protected java.lang.String localTaxpayerNameRow ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTaxpayerNameRowTracker = false ;

                           public boolean isTaxpayerNameRowSpecified(){
                               return localTaxpayerNameRowTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTaxpayerNameRow(){
                               return localTaxpayerNameRow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TaxpayerNameRow
                               */
                               public void setTaxpayerNameRow(java.lang.String param){
                            localTaxpayerNameRowTracker = true;
                                   
                                            this.localTaxpayerNameRow=param;
                                    

                               }
                            

                        /**
                        * field for TpinRow
                        */

                        
                                    protected java.lang.String localTpinRow ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTpinRowTracker = false ;

                           public boolean isTpinRowSpecified(){
                               return localTpinRowTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTpinRow(){
                               return localTpinRow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TpinRow
                               */
                               public void setTpinRow(java.lang.String param){
                            localTpinRowTracker = true;
                                   
                                            this.localTpinRow=param;
                                    

                               }
                            

                        /**
                        * field for TransactionCodeRow
                        */

                        
                                    protected java.lang.String localTransactionCodeRow ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransactionCodeRowTracker = false ;

                           public boolean isTransactionCodeRowSpecified(){
                               return localTransactionCodeRowTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTransactionCodeRow(){
                               return localTransactionCodeRow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransactionCodeRow
                               */
                               public void setTransactionCodeRow(java.lang.String param){
                            localTransactionCodeRowTracker = true;
                                   
                                            this.localTransactionCodeRow=param;
                                    

                               }
                            

                        /**
                        * field for TransactionDateRow
                        */

                        
                                    protected java.lang.String localTransactionDateRow ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransactionDateRowTracker = false ;

                           public boolean isTransactionDateRowSpecified(){
                               return localTransactionDateRowTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTransactionDateRow(){
                               return localTransactionDateRow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransactionDateRow
                               */
                               public void setTransactionDateRow(java.lang.String param){
                            localTransactionDateRowTracker = true;
                                   
                                            this.localTransactionDateRow=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://bean.bank.pmt.zra/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":WebPmtNotifyConsolidatedDtls",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "WebPmtNotifyConsolidatedDtls",
                           xmlWriter);
                   }

               
                   }
                if (localAccNameHdrTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "accNameHdr", xmlWriter);
                             

                                          if (localAccNameHdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAccNameHdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAccNoHdrTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "accNoHdr", xmlWriter);
                             

                                          if (localAccNoHdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAccNoHdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAckErrFlagHdrTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "ackErrFlagHdr", xmlWriter);
                             

                                          if (localAckErrFlagHdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAckErrFlagHdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAckSentHttpHdrTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "ackSentHttpHdr", xmlWriter);
                             

                                          if (localAckSentHttpHdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAckSentHttpHdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBalanceRowTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "balanceRow", xmlWriter);
                             

                                          if (localBalanceRow==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBalanceRow);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBankCodeHdrTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "bankCodeHdr", xmlWriter);
                             

                                          if (localBankCodeHdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBankCodeHdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBankIdHdrTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "bankIdHdr", xmlWriter);
                             

                                          if (localBankIdHdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBankIdHdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBranchNoHdrTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "branchNoHdr", xmlWriter);
                             

                                          if (localBranchNoHdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBranchNoHdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localChequeNoRowTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "chequeNoRow", xmlWriter);
                             

                                          if (localChequeNoRow==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localChequeNoRow);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localClosingBalHdrTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "closingBalHdr", xmlWriter);
                             

                                          if (localClosingBalHdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localClosingBalHdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCreditRowTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "creditRow", xmlWriter);
                             

                                          if (localCreditRow==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCreditRow);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDebitRowTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "debitRow", xmlWriter);
                             

                                          if (localDebitRow==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDebitRow);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDescriptionRowTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "descriptionRow", xmlWriter);
                             

                                          if (localDescriptionRow==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDescriptionRow);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDishoneredReasonRowTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "dishoneredReasonRow", xmlWriter);
                             

                                          if (localDishoneredReasonRow==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDishoneredReasonRow);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localErrorDescHdrTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "errorDescHdr", xmlWriter);
                             

                                          if (localErrorDescHdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localErrorDescHdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localExpryDateRowTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "expryDateRow", xmlWriter);
                             

                                          if (localExpryDateRow==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localExpryDateRow);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFileModifyDateHdrTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "fileModifyDateHdr", xmlWriter);
                             

                                          if (localFileModifyDateHdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFileModifyDateHdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFileTypeHdrTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "fileTypeHdr", xmlWriter);
                             

                                          if (localFileTypeHdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localFileTypeHdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localManualUploadHdrTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "manualUploadHdr", xmlWriter);
                             

                                          if (localManualUploadHdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localManualUploadHdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOpeningBalHdrTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "openingBalHdr", xmlWriter);
                             

                                          if (localOpeningBalHdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOpeningBalHdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPrnRowTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "prnRow", xmlWriter);
                             

                                          if (localPrnRow==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPrnRow);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReceiveDateHdrTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "receiveDateHdr", xmlWriter);
                             

                                          if (localReceiveDateHdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReceiveDateHdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStmtDateHdrTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "stmtDateHdr", xmlWriter);
                             

                                          if (localStmtDateHdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStmtDateHdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStmtNoHdrTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "stmtNoHdr", xmlWriter);
                             

                                          if (localStmtNoHdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStmtNoHdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTaxpayerNameRowTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "taxpayerNameRow", xmlWriter);
                             

                                          if (localTaxpayerNameRow==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTaxpayerNameRow);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTpinRowTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "tpinRow", xmlWriter);
                             

                                          if (localTpinRow==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTpinRow);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransactionCodeRowTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "transactionCodeRow", xmlWriter);
                             

                                          if (localTransactionCodeRow==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTransactionCodeRow);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransactionDateRowTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "transactionDateRow", xmlWriter);
                             

                                          if (localTransactionDateRow==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTransactionDateRow);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://bean.bank.pmt.zra/xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localAccNameHdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "accNameHdr"));
                                 
                                         elementList.add(localAccNameHdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccNameHdr));
                                    } if (localAccNoHdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "accNoHdr"));
                                 
                                         elementList.add(localAccNoHdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccNoHdr));
                                    } if (localAckErrFlagHdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "ackErrFlagHdr"));
                                 
                                         elementList.add(localAckErrFlagHdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAckErrFlagHdr));
                                    } if (localAckSentHttpHdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "ackSentHttpHdr"));
                                 
                                         elementList.add(localAckSentHttpHdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAckSentHttpHdr));
                                    } if (localBalanceRowTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "balanceRow"));
                                 
                                         elementList.add(localBalanceRow==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBalanceRow));
                                    } if (localBankCodeHdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "bankCodeHdr"));
                                 
                                         elementList.add(localBankCodeHdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBankCodeHdr));
                                    } if (localBankIdHdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "bankIdHdr"));
                                 
                                         elementList.add(localBankIdHdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBankIdHdr));
                                    } if (localBranchNoHdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "branchNoHdr"));
                                 
                                         elementList.add(localBranchNoHdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBranchNoHdr));
                                    } if (localChequeNoRowTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "chequeNoRow"));
                                 
                                         elementList.add(localChequeNoRow==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChequeNoRow));
                                    } if (localClosingBalHdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "closingBalHdr"));
                                 
                                         elementList.add(localClosingBalHdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClosingBalHdr));
                                    } if (localCreditRowTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "creditRow"));
                                 
                                         elementList.add(localCreditRow==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreditRow));
                                    } if (localDebitRowTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "debitRow"));
                                 
                                         elementList.add(localDebitRow==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDebitRow));
                                    } if (localDescriptionRowTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "descriptionRow"));
                                 
                                         elementList.add(localDescriptionRow==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescriptionRow));
                                    } if (localDishoneredReasonRowTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "dishoneredReasonRow"));
                                 
                                         elementList.add(localDishoneredReasonRow==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDishoneredReasonRow));
                                    } if (localErrorDescHdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "errorDescHdr"));
                                 
                                         elementList.add(localErrorDescHdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorDescHdr));
                                    } if (localExpryDateRowTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "expryDateRow"));
                                 
                                         elementList.add(localExpryDateRow==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpryDateRow));
                                    } if (localFileModifyDateHdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "fileModifyDateHdr"));
                                 
                                         elementList.add(localFileModifyDateHdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFileModifyDateHdr));
                                    } if (localFileTypeHdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "fileTypeHdr"));
                                 
                                         elementList.add(localFileTypeHdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFileTypeHdr));
                                    } if (localManualUploadHdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "manualUploadHdr"));
                                 
                                         elementList.add(localManualUploadHdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localManualUploadHdr));
                                    } if (localOpeningBalHdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "openingBalHdr"));
                                 
                                         elementList.add(localOpeningBalHdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOpeningBalHdr));
                                    } if (localPrnRowTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "prnRow"));
                                 
                                         elementList.add(localPrnRow==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrnRow));
                                    } if (localReceiveDateHdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "receiveDateHdr"));
                                 
                                         elementList.add(localReceiveDateHdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReceiveDateHdr));
                                    } if (localStmtDateHdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "stmtDateHdr"));
                                 
                                         elementList.add(localStmtDateHdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStmtDateHdr));
                                    } if (localStmtNoHdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "stmtNoHdr"));
                                 
                                         elementList.add(localStmtNoHdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStmtNoHdr));
                                    } if (localTaxpayerNameRowTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "taxpayerNameRow"));
                                 
                                         elementList.add(localTaxpayerNameRow==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTaxpayerNameRow));
                                    } if (localTpinRowTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "tpinRow"));
                                 
                                         elementList.add(localTpinRow==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTpinRow));
                                    } if (localTransactionCodeRowTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "transactionCodeRow"));
                                 
                                         elementList.add(localTransactionCodeRow==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionCodeRow));
                                    } if (localTransactionDateRowTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "transactionDateRow"));
                                 
                                         elementList.add(localTransactionDateRow==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionDateRow));
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static WebPmtNotifyConsolidatedDtls parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            WebPmtNotifyConsolidatedDtls object =
                new WebPmtNotifyConsolidatedDtls();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"WebPmtNotifyConsolidatedDtls".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (WebPmtNotifyConsolidatedDtls)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","accNameHdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAccNameHdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","accNoHdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAccNoHdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","ackErrFlagHdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAckErrFlagHdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","ackSentHttpHdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAckSentHttpHdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","balanceRow").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBalanceRow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","bankCodeHdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBankCodeHdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","bankIdHdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBankIdHdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","branchNoHdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBranchNoHdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","chequeNoRow").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setChequeNoRow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","closingBalHdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClosingBalHdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","creditRow").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreditRow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","debitRow").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDebitRow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","descriptionRow").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDescriptionRow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","dishoneredReasonRow").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDishoneredReasonRow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","errorDescHdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setErrorDescHdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","expryDateRow").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setExpryDateRow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","fileModifyDateHdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFileModifyDateHdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","fileTypeHdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFileTypeHdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","manualUploadHdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setManualUploadHdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","openingBalHdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOpeningBalHdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","prnRow").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPrnRow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","receiveDateHdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReceiveDateHdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","stmtDateHdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStmtDateHdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","stmtNoHdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStmtNoHdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","taxpayerNameRow").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTaxpayerNameRow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","tpinRow").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTpinRow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","transactionCodeRow").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransactionCodeRow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","transactionDateRow").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransactionDateRow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
        public static class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://bean.bank.pmt.zra/xsd".equals(namespaceURI) &&
                  "WebPmtNotifyConsolidatedDtls".equals(typeName)){
                   
                            return  WebPmtNotifyConsolidatedDtls.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bean.bank.pmt.zra/xsd".equals(namespaceURI) &&
                  "BankStatementNotifyErrorReport".equals(typeName)){
                   
                            return  BankStatementNotifyErrorReport.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://bean.bank.pmt.zra/xsd".equals(namespaceURI) &&
                  "BankStatementNotifyErrorResponse".equals(typeName)){
                   
                            return  BankStatementNotifyErrorResponse.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    
        public static class ProcessConsolidatedStatementResponse
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://service.bank.pmt.zra",
                "processConsolidatedStatementResponse",
                "ns2");

            

                        /**
                        * field for _return
                        */

                        
                                    protected BankStatementNotifyErrorResponse local_return ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean local_returnTracker = false ;

                           public boolean is_returnSpecified(){
                               return local_returnTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return BankStatementNotifyErrorResponse
                           */
                           public  BankStatementNotifyErrorResponse get_return(){
                               return local_return;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param _return
                               */
                               public void set_return(BankStatementNotifyErrorResponse param){
                            local_returnTracker = true;
                                   
                                            this.local_return=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://service.bank.pmt.zra");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":processConsolidatedStatementResponse",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "processConsolidatedStatementResponse",
                           xmlWriter);
                   }

               
                   }
                if (local_returnTracker){
                                    if (local_return==null){

                                        writeStartElement(null, "http://service.bank.pmt.zra", "return", xmlWriter);

                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     local_return.serialize(new javax.xml.namespace.QName("http://service.bank.pmt.zra","return"),
                                        xmlWriter);
                                    }
                                }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://service.bank.pmt.zra")){
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (local_returnTracker){
                            elementList.add(new javax.xml.namespace.QName("http://service.bank.pmt.zra",
                                                                      "return"));
                            
                            
                                    elementList.add(local_return==null?null:
                                    local_return);
                                }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static ProcessConsolidatedStatementResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ProcessConsolidatedStatementResponse object =
                new ProcessConsolidatedStatementResponse();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"processConsolidatedStatementResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ProcessConsolidatedStatementResponse)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.bank.pmt.zra","return").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.set_return(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.set_return(BankStatementNotifyErrorResponse.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
        public static class BankStatementNotifyErrorReport
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = BankStatementNotifyErrorReport
                Namespace URI = http://bean.bank.pmt.zra/xsd
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for AccNoHdr
                        */

                        
                                    protected java.lang.String localAccNoHdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccNoHdrTracker = false ;

                           public boolean isAccNoHdrSpecified(){
                               return localAccNoHdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAccNoHdr(){
                               return localAccNoHdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AccNoHdr
                               */
                               public void setAccNoHdr(java.lang.String param){
                            localAccNoHdrTracker = true;
                                   
                                            this.localAccNoHdr=param;
                                    

                               }
                            

                        /**
                        * field for BalanceRow
                        */

                        
                                    protected java.lang.String localBalanceRow ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBalanceRowTracker = false ;

                           public boolean isBalanceRowSpecified(){
                               return localBalanceRowTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBalanceRow(){
                               return localBalanceRow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BalanceRow
                               */
                               public void setBalanceRow(java.lang.String param){
                            localBalanceRowTracker = true;
                                   
                                            this.localBalanceRow=param;
                                    

                               }
                            

                        /**
                        * field for BankCode
                        */

                        
                                    protected java.lang.String localBankCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBankCodeTracker = false ;

                           public boolean isBankCodeSpecified(){
                               return localBankCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getBankCode(){
                               return localBankCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BankCode
                               */
                               public void setBankCode(java.lang.String param){
                            localBankCodeTracker = true;
                                   
                                            this.localBankCode=param;
                                    

                               }
                            

                        /**
                        * field for ClosingBalHdr
                        */

                        
                                    protected java.lang.String localClosingBalHdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localClosingBalHdrTracker = false ;

                           public boolean isClosingBalHdrSpecified(){
                               return localClosingBalHdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getClosingBalHdr(){
                               return localClosingBalHdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ClosingBalHdr
                               */
                               public void setClosingBalHdr(java.lang.String param){
                            localClosingBalHdrTracker = true;
                                   
                                            this.localClosingBalHdr=param;
                                    

                               }
                            

                        /**
                        * field for CreditRow
                        */

                        
                                    protected java.lang.String localCreditRow ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCreditRowTracker = false ;

                           public boolean isCreditRowSpecified(){
                               return localCreditRowTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCreditRow(){
                               return localCreditRow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CreditRow
                               */
                               public void setCreditRow(java.lang.String param){
                            localCreditRowTracker = true;
                                   
                                            this.localCreditRow=param;
                                    

                               }
                            

                        /**
                        * field for DebitRow
                        */

                        
                                    protected java.lang.String localDebitRow ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDebitRowTracker = false ;

                           public boolean isDebitRowSpecified(){
                               return localDebitRowTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDebitRow(){
                               return localDebitRow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DebitRow
                               */
                               public void setDebitRow(java.lang.String param){
                            localDebitRowTracker = true;
                                   
                                            this.localDebitRow=param;
                                    

                               }
                            

                        /**
                        * field for ErrorCode
                        */

                        
                                    protected java.lang.String localErrorCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorCodeTracker = false ;

                           public boolean isErrorCodeSpecified(){
                               return localErrorCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getErrorCode(){
                               return localErrorCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorCode
                               */
                               public void setErrorCode(java.lang.String param){
                            localErrorCodeTracker = true;
                                   
                                            this.localErrorCode=param;
                                    

                               }
                            

                        /**
                        * field for ErrorMessage
                        */

                        
                                    protected java.lang.String localErrorMessage ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorMessageTracker = false ;

                           public boolean isErrorMessageSpecified(){
                               return localErrorMessageTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getErrorMessage(){
                               return localErrorMessage;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorMessage
                               */
                               public void setErrorMessage(java.lang.String param){
                            localErrorMessageTracker = true;
                                   
                                            this.localErrorMessage=param;
                                    

                               }
                            

                        /**
                        * field for OpeningBalHdr
                        */

                        
                                    protected java.lang.String localOpeningBalHdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOpeningBalHdrTracker = false ;

                           public boolean isOpeningBalHdrSpecified(){
                               return localOpeningBalHdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getOpeningBalHdr(){
                               return localOpeningBalHdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param OpeningBalHdr
                               */
                               public void setOpeningBalHdr(java.lang.String param){
                            localOpeningBalHdrTracker = true;
                                   
                                            this.localOpeningBalHdr=param;
                                    

                               }
                            

                        /**
                        * field for RowNum
                        */

                        
                                    protected java.lang.String localRowNum ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRowNumTracker = false ;

                           public boolean isRowNumSpecified(){
                               return localRowNumTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRowNum(){
                               return localRowNum;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RowNum
                               */
                               public void setRowNum(java.lang.String param){
                            localRowNumTracker = true;
                                   
                                            this.localRowNum=param;
                                    

                               }
                            

                        /**
                        * field for StmtDateHdr
                        */

                        
                                    protected java.lang.String localStmtDateHdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStmtDateHdrTracker = false ;

                           public boolean isStmtDateHdrSpecified(){
                               return localStmtDateHdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStmtDateHdr(){
                               return localStmtDateHdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StmtDateHdr
                               */
                               public void setStmtDateHdr(java.lang.String param){
                            localStmtDateHdrTracker = true;
                                   
                                            this.localStmtDateHdr=param;
                                    

                               }
                            

                        /**
                        * field for StmtNoHdr
                        */

                        
                                    protected java.lang.String localStmtNoHdr ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStmtNoHdrTracker = false ;

                           public boolean isStmtNoHdrSpecified(){
                               return localStmtNoHdrTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getStmtNoHdr(){
                               return localStmtNoHdr;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StmtNoHdr
                               */
                               public void setStmtNoHdr(java.lang.String param){
                            localStmtNoHdrTracker = true;
                                   
                                            this.localStmtNoHdr=param;
                                    

                               }
                            

                        /**
                        * field for TpinRow
                        */

                        
                                    protected java.lang.String localTpinRow ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTpinRowTracker = false ;

                           public boolean isTpinRowSpecified(){
                               return localTpinRowTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTpinRow(){
                               return localTpinRow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TpinRow
                               */
                               public void setTpinRow(java.lang.String param){
                            localTpinRowTracker = true;
                                   
                                            this.localTpinRow=param;
                                    

                               }
                            

                        /**
                        * field for TransactionDateRow
                        */

                        
                                    protected java.lang.String localTransactionDateRow ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTransactionDateRowTracker = false ;

                           public boolean isTransactionDateRowSpecified(){
                               return localTransactionDateRowTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getTransactionDateRow(){
                               return localTransactionDateRow;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TransactionDateRow
                               */
                               public void setTransactionDateRow(java.lang.String param){
                            localTransactionDateRowTracker = true;
                                   
                                            this.localTransactionDateRow=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://bean.bank.pmt.zra/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":BankStatementNotifyErrorReport",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "BankStatementNotifyErrorReport",
                           xmlWriter);
                   }

               
                   }
                if (localAccNoHdrTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "accNoHdr", xmlWriter);
                             

                                          if (localAccNoHdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAccNoHdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBalanceRowTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "balanceRow", xmlWriter);
                             

                                          if (localBalanceRow==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBalanceRow);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBankCodeTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "bankCode", xmlWriter);
                             

                                          if (localBankCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localBankCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localClosingBalHdrTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "closingBalHdr", xmlWriter);
                             

                                          if (localClosingBalHdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localClosingBalHdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCreditRowTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "creditRow", xmlWriter);
                             

                                          if (localCreditRow==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCreditRow);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localDebitRowTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "debitRow", xmlWriter);
                             

                                          if (localDebitRow==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDebitRow);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localErrorCodeTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "errorCode", xmlWriter);
                             

                                          if (localErrorCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localErrorCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localErrorMessageTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "errorMessage", xmlWriter);
                             

                                          if (localErrorMessage==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localErrorMessage);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localOpeningBalHdrTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "openingBalHdr", xmlWriter);
                             

                                          if (localOpeningBalHdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localOpeningBalHdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRowNumTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "rowNum", xmlWriter);
                             

                                          if (localRowNum==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRowNum);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStmtDateHdrTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "stmtDateHdr", xmlWriter);
                             

                                          if (localStmtDateHdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStmtDateHdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStmtNoHdrTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "stmtNoHdr", xmlWriter);
                             

                                          if (localStmtNoHdr==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localStmtNoHdr);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTpinRowTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "tpinRow", xmlWriter);
                             

                                          if (localTpinRow==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTpinRow);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTransactionDateRowTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "transactionDateRow", xmlWriter);
                             

                                          if (localTransactionDateRow==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localTransactionDateRow);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://bean.bank.pmt.zra/xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localAccNoHdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "accNoHdr"));
                                 
                                         elementList.add(localAccNoHdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccNoHdr));
                                    } if (localBalanceRowTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "balanceRow"));
                                 
                                         elementList.add(localBalanceRow==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBalanceRow));
                                    } if (localBankCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "bankCode"));
                                 
                                         elementList.add(localBankCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBankCode));
                                    } if (localClosingBalHdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "closingBalHdr"));
                                 
                                         elementList.add(localClosingBalHdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClosingBalHdr));
                                    } if (localCreditRowTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "creditRow"));
                                 
                                         elementList.add(localCreditRow==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreditRow));
                                    } if (localDebitRowTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "debitRow"));
                                 
                                         elementList.add(localDebitRow==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDebitRow));
                                    } if (localErrorCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "errorCode"));
                                 
                                         elementList.add(localErrorCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorCode));
                                    } if (localErrorMessageTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "errorMessage"));
                                 
                                         elementList.add(localErrorMessage==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorMessage));
                                    } if (localOpeningBalHdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "openingBalHdr"));
                                 
                                         elementList.add(localOpeningBalHdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOpeningBalHdr));
                                    } if (localRowNumTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "rowNum"));
                                 
                                         elementList.add(localRowNum==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRowNum));
                                    } if (localStmtDateHdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "stmtDateHdr"));
                                 
                                         elementList.add(localStmtDateHdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStmtDateHdr));
                                    } if (localStmtNoHdrTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "stmtNoHdr"));
                                 
                                         elementList.add(localStmtNoHdr==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStmtNoHdr));
                                    } if (localTpinRowTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "tpinRow"));
                                 
                                         elementList.add(localTpinRow==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTpinRow));
                                    } if (localTransactionDateRowTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "transactionDateRow"));
                                 
                                         elementList.add(localTransactionDateRow==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTransactionDateRow));
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static BankStatementNotifyErrorReport parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            BankStatementNotifyErrorReport object =
                new BankStatementNotifyErrorReport();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"BankStatementNotifyErrorReport".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (BankStatementNotifyErrorReport)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","accNoHdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAccNoHdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","balanceRow").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBalanceRow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","bankCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setBankCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","closingBalHdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setClosingBalHdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","creditRow").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCreditRow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","debitRow").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDebitRow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","errorCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setErrorCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","errorMessage").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setErrorMessage(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","openingBalHdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setOpeningBalHdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","rowNum").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRowNum(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","stmtDateHdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStmtDateHdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","stmtNoHdr").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setStmtNoHdr(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","tpinRow").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTpinRow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","transactionDateRow").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTransactionDateRow(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
        public static class BankStatementNotifyErrorResponse
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = BankStatementNotifyErrorResponse
                Namespace URI = http://bean.bank.pmt.zra/xsd
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for ErrorCode
                        */

                        
                                    protected java.lang.String localErrorCode ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorCodeTracker = false ;

                           public boolean isErrorCodeSpecified(){
                               return localErrorCodeTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getErrorCode(){
                               return localErrorCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorCode
                               */
                               public void setErrorCode(java.lang.String param){
                            localErrorCodeTracker = true;
                                   
                                            this.localErrorCode=param;
                                    

                               }
                            

                        /**
                        * field for ErrorDiscription
                        */

                        
                                    protected java.lang.String localErrorDiscription ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localErrorDiscriptionTracker = false ;

                           public boolean isErrorDiscriptionSpecified(){
                               return localErrorDiscriptionTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getErrorDiscription(){
                               return localErrorDiscription;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ErrorDiscription
                               */
                               public void setErrorDiscription(java.lang.String param){
                            localErrorDiscriptionTracker = true;
                                   
                                            this.localErrorDiscription=param;
                                    

                               }
                            

                        /**
                        * field for PmtBankStatementNotifyErrReport
                        * This was an Array!
                        */

                        
                                    protected BankStatementNotifyErrorReport[] localPmtBankStatementNotifyErrReport ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPmtBankStatementNotifyErrReportTracker = false ;

                           public boolean isPmtBankStatementNotifyErrReportSpecified(){
                               return localPmtBankStatementNotifyErrReportTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return BankStatementNotifyErrorReport[]
                           */
                           public  BankStatementNotifyErrorReport[] getPmtBankStatementNotifyErrReport(){
                               return localPmtBankStatementNotifyErrReport;
                           }

                           
                        


                               
                              /**
                               * validate the array for PmtBankStatementNotifyErrReport
                               */
                              protected void validatePmtBankStatementNotifyErrReport(BankStatementNotifyErrorReport[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param PmtBankStatementNotifyErrReport
                              */
                              public void setPmtBankStatementNotifyErrReport(BankStatementNotifyErrorReport[] param){
                              
                                   validatePmtBankStatementNotifyErrReport(param);

                               localPmtBankStatementNotifyErrReportTracker = true;
                                      
                                      this.localPmtBankStatementNotifyErrReport=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param BankStatementNotifyErrorReport
                             */
                             public void addPmtBankStatementNotifyErrReport(BankStatementNotifyErrorReport param){
                                   if (localPmtBankStatementNotifyErrReport == null){
                                   localPmtBankStatementNotifyErrReport = new BankStatementNotifyErrorReport[]{};
                                   }

                            
                                 //update the setting tracker
                                localPmtBankStatementNotifyErrReportTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localPmtBankStatementNotifyErrReport);
                               list.add(param);
                               this.localPmtBankStatementNotifyErrReport =
                             (BankStatementNotifyErrorReport[])list.toArray(
                            new BankStatementNotifyErrorReport[list.size()]);

                             }
                             

                        /**
                        * field for RowNumber
                        */

                        
                                    protected java.lang.String localRowNumber ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRowNumberTracker = false ;

                           public boolean isRowNumberSpecified(){
                               return localRowNumberTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRowNumber(){
                               return localRowNumber;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RowNumber
                               */
                               public void setRowNumber(java.lang.String param){
                            localRowNumberTracker = true;
                                   
                                            this.localRowNumber=param;
                                    

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://bean.bank.pmt.zra/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":BankStatementNotifyErrorResponse",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "BankStatementNotifyErrorResponse",
                           xmlWriter);
                   }

               
                   }
                if (localErrorCodeTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "errorCode", xmlWriter);
                             

                                          if (localErrorCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localErrorCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localErrorDiscriptionTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "errorDiscription", xmlWriter);
                             

                                          if (localErrorDiscription==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localErrorDiscription);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPmtBankStatementNotifyErrReportTracker){
                                       if (localPmtBankStatementNotifyErrReport!=null){
                                            for (int i = 0;i < localPmtBankStatementNotifyErrReport.length;i++){
                                                if (localPmtBankStatementNotifyErrReport[i] != null){
                                                 localPmtBankStatementNotifyErrReport[i].serialize(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","pmtBankStatementNotifyErrReport"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://bean.bank.pmt.zra/xsd", "pmtBankStatementNotifyErrReport", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://bean.bank.pmt.zra/xsd", "pmtBankStatementNotifyErrReport", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localRowNumberTracker){
                                    namespace = "http://bean.bank.pmt.zra/xsd";
                                    writeStartElement(null, namespace, "rowNumber", xmlWriter);
                             

                                          if (localRowNumber==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRowNumber);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://bean.bank.pmt.zra/xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localErrorCodeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "errorCode"));
                                 
                                         elementList.add(localErrorCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorCode));
                                    } if (localErrorDiscriptionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "errorDiscription"));
                                 
                                         elementList.add(localErrorDiscription==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorDiscription));
                                    } if (localPmtBankStatementNotifyErrReportTracker){
                             if (localPmtBankStatementNotifyErrReport!=null) {
                                 for (int i = 0;i < localPmtBankStatementNotifyErrReport.length;i++){

                                    if (localPmtBankStatementNotifyErrReport[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                          "pmtBankStatementNotifyErrReport"));
                                         elementList.add(localPmtBankStatementNotifyErrReport[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                          "pmtBankStatementNotifyErrReport"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                          "pmtBankStatementNotifyErrReport"));
                                        elementList.add(localPmtBankStatementNotifyErrReport);
                                    
                             }

                        } if (localRowNumberTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd",
                                                                      "rowNumber"));
                                 
                                         elementList.add(localRowNumber==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRowNumber));
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static BankStatementNotifyErrorResponse parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            BankStatementNotifyErrorResponse object =
                new BankStatementNotifyErrorResponse();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"BankStatementNotifyErrorResponse".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (BankStatementNotifyErrorResponse)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","errorCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setErrorCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","errorDiscription").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setErrorDiscription(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","pmtBankStatementNotifyErrReport").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list3.add(null);
                                                              reader.next();
                                                          } else {
                                                        list3.add(BankStatementNotifyErrorReport.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone3 = false;
                                                        while(!loopDone3){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone3 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","pmtBankStatementNotifyErrReport").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list3.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list3.add(BankStatementNotifyErrorReport.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone3 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setPmtBankStatementNotifyErrReport((BankStatementNotifyErrorReport[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                BankStatementNotifyErrorReport.class,
                                                                list3));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://bean.bank.pmt.zra/xsd","rowNumber").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRowNumber(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
        public static class ProcessConsolidatedStatement
        implements org.apache.axis2.databinding.ADBBean{
        
                public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
                "http://service.bank.pmt.zra",
                "processConsolidatedStatement",
                "ns2");

            

                        /**
                        * field for WebPmtNotifyConsolidatedDtls
                        * This was an Array!
                        */

                        
                                    protected WebPmtNotifyConsolidatedDtls[] localWebPmtNotifyConsolidatedDtls ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWebPmtNotifyConsolidatedDtlsTracker = false ;

                           public boolean isWebPmtNotifyConsolidatedDtlsSpecified(){
                               return localWebPmtNotifyConsolidatedDtlsTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return WebPmtNotifyConsolidatedDtls[]
                           */
                           public  WebPmtNotifyConsolidatedDtls[] getWebPmtNotifyConsolidatedDtls(){
                               return localWebPmtNotifyConsolidatedDtls;
                           }

                           
                        


                               
                              /**
                               * validate the array for WebPmtNotifyConsolidatedDtls
                               */
                              protected void validateWebPmtNotifyConsolidatedDtls(WebPmtNotifyConsolidatedDtls[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param WebPmtNotifyConsolidatedDtls
                              */
                              public void setWebPmtNotifyConsolidatedDtls(WebPmtNotifyConsolidatedDtls[] param){
                              
                                   validateWebPmtNotifyConsolidatedDtls(param);

                               localWebPmtNotifyConsolidatedDtlsTracker = true;
                                      
                                      this.localWebPmtNotifyConsolidatedDtls=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param WebPmtNotifyConsolidatedDtls
                             */
                             public void addWebPmtNotifyConsolidatedDtls(WebPmtNotifyConsolidatedDtls param){
                                   if (localWebPmtNotifyConsolidatedDtls == null){
                                   localWebPmtNotifyConsolidatedDtls = new WebPmtNotifyConsolidatedDtls[]{};
                                   }

                            
                                 //update the setting tracker
                                localWebPmtNotifyConsolidatedDtlsTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localWebPmtNotifyConsolidatedDtls);
                               list.add(param);
                               this.localWebPmtNotifyConsolidatedDtls =
                             (WebPmtNotifyConsolidatedDtls[])list.toArray(
                            new WebPmtNotifyConsolidatedDtls[list.size()]);

                             }
                             

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,MY_QNAME);
               return factory.createOMElement(dataSource,MY_QNAME);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://service.bank.pmt.zra");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":processConsolidatedStatement",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "processConsolidatedStatement",
                           xmlWriter);
                   }

               
                   }
                if (localWebPmtNotifyConsolidatedDtlsTracker){
                                       if (localWebPmtNotifyConsolidatedDtls!=null){
                                            for (int i = 0;i < localWebPmtNotifyConsolidatedDtls.length;i++){
                                                if (localWebPmtNotifyConsolidatedDtls[i] != null){
                                                 localWebPmtNotifyConsolidatedDtls[i].serialize(new javax.xml.namespace.QName("http://service.bank.pmt.zra","webPmtNotifyConsolidatedDtls"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://service.bank.pmt.zra", "webPmtNotifyConsolidatedDtls", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://service.bank.pmt.zra", "webPmtNotifyConsolidatedDtls", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://service.bank.pmt.zra")){
                return "ns2";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localWebPmtNotifyConsolidatedDtlsTracker){
                             if (localWebPmtNotifyConsolidatedDtls!=null) {
                                 for (int i = 0;i < localWebPmtNotifyConsolidatedDtls.length;i++){

                                    if (localWebPmtNotifyConsolidatedDtls[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://service.bank.pmt.zra",
                                                                          "webPmtNotifyConsolidatedDtls"));
                                         elementList.add(localWebPmtNotifyConsolidatedDtls[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://service.bank.pmt.zra",
                                                                          "webPmtNotifyConsolidatedDtls"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://service.bank.pmt.zra",
                                                                          "webPmtNotifyConsolidatedDtls"));
                                        elementList.add(localWebPmtNotifyConsolidatedDtls);
                                    
                             }

                        }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static ProcessConsolidatedStatement parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            ProcessConsolidatedStatement object =
                new ProcessConsolidatedStatement();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"processConsolidatedStatement".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (ProcessConsolidatedStatement)ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://service.bank.pmt.zra","webPmtNotifyConsolidatedDtls").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list1.add(null);
                                                              reader.next();
                                                          } else {
                                                        list1.add(WebPmtNotifyConsolidatedDtls.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone1 = false;
                                                        while(!loopDone1){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone1 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://service.bank.pmt.zra","webPmtNotifyConsolidatedDtls").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list1.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list1.add(WebPmtNotifyConsolidatedDtls.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setWebPmtNotifyConsolidatedDtls((WebPmtNotifyConsolidatedDtls[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                WebPmtNotifyConsolidatedDtls.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    
            private  org.apache.axiom.om.OMElement  toOM(service.BankStatementNotificationServiceStub.ProcessConsolidatedStatement param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(service.BankStatementNotificationServiceStub.ProcessConsolidatedStatement.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(service.BankStatementNotificationServiceStub.ProcessConsolidatedStatementResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(service.BankStatementNotificationServiceStub.ProcessConsolidatedStatementResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                                    
                                        private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, service.BankStatementNotificationServiceStub.ProcessConsolidatedStatement param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                        throws org.apache.axis2.AxisFault{

                                             
                                                    try{

                                                            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                                                            emptyEnvelope.getBody().addChild(param.getOMElement(service.BankStatementNotificationServiceStub.ProcessConsolidatedStatement.MY_QNAME,factory));
                                                            return emptyEnvelope;
                                                        } catch(org.apache.axis2.databinding.ADBException e){
                                                            throw org.apache.axis2.AxisFault.makeFault(e);
                                                        }
                                                

                                        }
                                
                             
                             /* methods to provide back word compatibility */

                             


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (service.BankStatementNotificationServiceStub.ProcessConsolidatedStatement.class.equals(type)){
                
                           return service.BankStatementNotificationServiceStub.ProcessConsolidatedStatement.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (service.BankStatementNotificationServiceStub.ProcessConsolidatedStatementResponse.class.equals(type)){
                
                           return service.BankStatementNotificationServiceStub.ProcessConsolidatedStatementResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    
   }
   