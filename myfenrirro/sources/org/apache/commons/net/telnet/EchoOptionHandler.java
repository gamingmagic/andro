package org.apache.commons.net.telnet;

public class EchoOptionHandler extends TelnetOptionHandler {
    public EchoOptionHandler(boolean z, boolean z2, boolean z3, boolean z4) {
        super(1, z, z2, z3, z4);
    }

    public EchoOptionHandler() {
        super(1, false, false, false, false);
    }

    public int[] answerSubnegotiation(int[] iArr, int i) {
        return null;
    }

    public int[] startSubnegotiationLocal() {
        return null;
    }

    public int[] startSubnegotiationRemote() {
        return null;
    }
}
