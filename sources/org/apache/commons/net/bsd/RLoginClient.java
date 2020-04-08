package org.apache.commons.net.bsd;

public class RLoginClient extends RCommandClient {
    public static final int DEFAULT_PORT = 513;

    public RLoginClient() {
        setDefaultPort(513);
    }

    public void rlogin(String str, String str2, String str3, int i) {
        rexec(str, str2, str3 + "/" + i, false);
    }

    public void rlogin(String str, String str2, String str3) {
        rexec(str, str2, str3, false);
    }
}
