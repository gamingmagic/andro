package org.apache.commons.net.telnet;

public class SimpleOptionHandler extends TelnetOptionHandler {
    public SimpleOptionHandler(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(i, z, z2, z3, z4);
    }

    public SimpleOptionHandler(int i) {
        super(i, false, false, false, false);
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
