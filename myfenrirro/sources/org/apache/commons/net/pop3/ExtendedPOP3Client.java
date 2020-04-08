package org.apache.commons.net.pop3;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.net.util.Base64;

public class ExtendedPOP3Client extends POP3SClient {

    public enum AUTH_METHOD {
        PLAIN("PLAIN"),
        CRAM_MD5("CRAM-MD5");
        
        private final String methodName;

        private AUTH_METHOD(String str) {
            this.methodName = str;
        }

        public final String getAuthName() {
            return this.methodName;
        }
    }

    public boolean auth(AUTH_METHOD auth_method, String str, String str2) {
        if (sendCommand(13, auth_method.getAuthName()) != 2) {
            return false;
        }
        switch (auth_method) {
            case PLAIN:
                return sendCommand(new String(Base64.encodeBase64(new StringBuilder("\u0000").append(str).append("\u0000").append(str2).toString().getBytes()))) == 0;
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
                return sendCommand(Base64.encodeBase64StringUnChunked(bArr)) == 0;
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
