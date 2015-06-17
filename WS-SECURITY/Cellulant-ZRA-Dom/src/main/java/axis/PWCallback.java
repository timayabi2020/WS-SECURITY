package axis;

import org.apache.ws.security.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import java.io.IOException;

public class PWCallback implements CallbackHandler {

    /** Field key */
    private static final byte[] key = {
            (byte) 0x31, (byte) 0xfd, (byte) 0xcb, (byte) 0xda, (byte) 0xfb,
            (byte) 0xcd, (byte) 0x6b, (byte) 0xa8, (byte) 0xe6, (byte) 0x19,
            (byte) 0xa7, (byte) 0xbf, (byte) 0x51, (byte) 0xf7, (byte) 0xc7,
            (byte) 0x3e, (byte) 0x80, (byte) 0xae, (byte) 0x98, (byte) 0x51,
            (byte) 0xc8, (byte) 0x51, (byte) 0x34, (byte) 0x04,
    };

    /**
     * Method handle
     *
     * @param callbacks
     * @throws IOException
     * @throws UnsupportedCallbackException
     */
    public void handle(Callback[] callbacks)
            throws IOException, UnsupportedCallbackException {

        for (int i = 0; i < callbacks.length; i++) {
            if (callbacks[i] instanceof WSPasswordCallback) {
                WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];
                //@todo: Improve logic by identifier & usage
                //System.out.println("xxx retrieve password for : "+pc.getIdentifier() );
                if (pc.getUsage() == WSPasswordCallback.KEY_NAME) {
                    pc.setKey(key);
                } else if(pc.getIdentifier().equals("zra") || pc.getUsage() == WSPasswordCallback.DECRYPT) {
                    pc.setPassword("test123");//Used when encrypting
                } else if(pc.getIdentifier().equals("03404_barclays") || pc.getIdentifier().equals("cellulant")) {
                    pc.setPassword("test123");//Used when signing
                } else if (pc.getUsage() == WSPasswordCallback.SIGNATURE ) {
                    if ("cellulant".equals(pc.getIdentifier()) || pc.getIdentifier().equals("03404_barclays")) {
                        pc.setPassword("test123");//Used when signing but already catered for in policy. needed?
                    }
                }
            } else {
                throw new UnsupportedCallbackException(callbacks[i],
                        "Unrecognized Callback");
            }
        }
    }
}