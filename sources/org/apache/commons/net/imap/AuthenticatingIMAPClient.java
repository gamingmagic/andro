package org.apache.commons.net.imap;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLContext;
import org.apache.commons.net.imap.IMAP.IMAPState;
import org.apache.commons.net.util.Base64;

public class AuthenticatingIMAPClient extends IMAPSClient {

    public enum AUTH_METHOD {
        PLAIN("PLAIN"),
        CRAM_MD5("CRAM-MD5"),
        LOGIN("LOGIN"),
        XOAUTH("XOAUTH");
        
        private final String authName;

        private AUTH_METHOD(String str) {
            this.authName = str;
        }

        public final String getAuthName() {
            return this.authName;
        }
    }

    public AuthenticatingIMAPClient() {
        this("TLS", false);
    }

    public AuthenticatingIMAPClient(boolean z) {
        this("TLS", z);
    }

    public AuthenticatingIMAPClient(String str) {
        this(str, false);
    }

    public AuthenticatingIMAPClient(String str, boolean z) {
        this(str, z, null);
    }

    public AuthenticatingIMAPClient(String str, boolean z, SSLContext sSLContext) {
        super(str, z, sSLContext);
    }

    public AuthenticatingIMAPClient(boolean z, SSLContext sSLContext) {
        this("TLS", z, sSLContext);
    }

    public AuthenticatingIMAPClient(SSLContext sSLContext) {
        this(false, sSLContext);
    }

    public boolean authenticate(AUTH_METHOD auth_method, String str, String str2) {
        return auth(auth_method, str, str2);
    }

    public boolean auth(AUTH_METHOD auth_method, String str, String str2) {
        if (!IMAPReply.isContinuation(sendCommand(IMAPCommand.AUTHENTICATE, auth_method.getAuthName()))) {
            return false;
        }
        switch (auth_method) {
            case PLAIN:
                int sendData = sendData(Base64.encodeBase64StringUnChunked(("\u0000" + str + "\u0000" + str2).getBytes()));
                if (sendData == 0) {
                    setState(IMAPState.AUTH_STATE);
                }
                return sendData == 0;
            case CRAM_MD5:
                byte[] decodeBase64 = Base64.decodeBase64(getReplyString().substring(2).trim());
                Mac instance = Mac.getInstance("HmacMD5");
                instance.init(new SecretKeySpec(str2.getBytes(), "HmacMD5"));
                byte[] bytes = _convertToHexString(instance.doFinal(decodeBase64)).getBytes();
                byte[] bytes2 = str.getBytes();
                byte[] bArr = new byte[(bytes2.length + 1 + bytes.length)];
                System.arraycopy(bytes2, 0, bArr, 0, bytes2.length);
                bArr[bytes2.length] = 32;
                System.arraycopy(bytes, 0, bArr, bytes2.length + 1, bytes.length);
                int sendData2 = sendData(Base64.encodeBase64StringUnChunked(bArr));
                if (sendData2 == 0) {
                    setState(IMAPState.AUTH_STATE);
                }
                return sendData2 == 0;
            case LOGIN:
                if (sendData(Base64.encodeBase64StringUnChunked(str.getBytes())) != 3) {
                    return false;
                }
                int sendData3 = sendData(Base64.encodeBase64StringUnChunked(str2.getBytes()));
                if (sendData3 == 0) {
                    setState(IMAPState.AUTH_STATE);
                }
                return sendData3 == 0;
            case XOAUTH:
                int sendData4 = sendData(new String(str.getBytes()));
                if (sendData4 == 0) {
                    setState(IMAPState.AUTH_STATE);
                }
                return sendData4 == 0;
            default:
                return false;
        }
    }

    private String _convertToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            if ((b & 255) <= 15) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(b & 255));
        }
        return sb.toString();
    }
}
