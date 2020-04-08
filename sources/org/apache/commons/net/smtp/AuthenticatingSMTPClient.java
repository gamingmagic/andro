package org.apache.commons.net.smtp;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.net.util.Base64;

public class AuthenticatingSMTPClient extends SMTPSClient {

    public enum AUTH_METHOD {
        PLAIN,
        CRAM_MD5,
        LOGIN,
        XOAUTH;

        public static final String getAuthName(AUTH_METHOD auth_method) {
            if (auth_method.equals(PLAIN)) {
                return "PLAIN";
            }
            if (auth_method.equals(CRAM_MD5)) {
                return "CRAM-MD5";
            }
            if (auth_method.equals(LOGIN)) {
                return "LOGIN";
            }
            if (auth_method.equals(XOAUTH)) {
                return "XOAUTH";
            }
            return null;
        }
    }

    public AuthenticatingSMTPClient() {
    }

    public AuthenticatingSMTPClient(String str) {
        super(str);
    }

    public int ehlo(String str) {
        return sendCommand(15, str);
    }

    public boolean elogin(String str) {
        return SMTPReply.isPositiveCompletion(ehlo(str));
    }

    public boolean elogin() {
        String hostName = getLocalAddress().getHostName();
        if (hostName == null) {
            return false;
        }
        return SMTPReply.isPositiveCompletion(ehlo(hostName));
    }

    public int[] getEnhancedReplyCode() {
        String substring = getReplyString().substring(4);
        String[] split = substring.substring(0, substring.indexOf(32)).split("\\.");
        int[] iArr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            iArr[i] = Integer.parseInt(split[i]);
        }
        return iArr;
    }

    public boolean auth(AUTH_METHOD auth_method, String str, String str2) {
        if (!SMTPReply.isPositiveIntermediate(sendCommand(14, AUTH_METHOD.getAuthName(auth_method)))) {
            return false;
        }
        if (auth_method.equals(AUTH_METHOD.PLAIN)) {
            return SMTPReply.isPositiveCompletion(sendCommand(Base64.encodeBase64StringUnChunked(("\u0000" + str + "\u0000" + str2).getBytes())));
        }
        if (auth_method.equals(AUTH_METHOD.CRAM_MD5)) {
            byte[] decodeBase64 = Base64.decodeBase64(getReplyString().substring(4).trim());
            Mac instance = Mac.getInstance("HmacMD5");
            instance.init(new SecretKeySpec(str2.getBytes(), "HmacMD5"));
            byte[] bytes = _convertToHexString(instance.doFinal(decodeBase64)).getBytes();
            byte[] bytes2 = str.getBytes();
            byte[] bArr = new byte[(bytes2.length + 1 + bytes.length)];
            System.arraycopy(bytes2, 0, bArr, 0, bytes2.length);
            bArr[bytes2.length] = 32;
            System.arraycopy(bytes, 0, bArr, bytes2.length + 1, bytes.length);
            return SMTPReply.isPositiveCompletion(sendCommand(Base64.encodeBase64StringUnChunked(bArr)));
        } else if (auth_method.equals(AUTH_METHOD.LOGIN)) {
            if (!SMTPReply.isPositiveIntermediate(sendCommand(Base64.encodeBase64StringUnChunked(str.getBytes())))) {
                return false;
            }
            return SMTPReply.isPositiveCompletion(sendCommand(Base64.encodeBase64StringUnChunked(str2.getBytes())));
        } else if (auth_method.equals(AUTH_METHOD.XOAUTH)) {
            return SMTPReply.isPositiveIntermediate(sendCommand(Base64.encodeBase64StringUnChunked(str.getBytes())));
        } else {
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
