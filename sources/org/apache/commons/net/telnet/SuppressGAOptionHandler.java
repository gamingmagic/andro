package org.apache.commons.net.telnet;

public class SuppressGAOptionHandler extends TelnetOptionHandler {
    public SuppressGAOptionHandler(boolean z, boolean z2, boolean z3, boolean z4) {
        super(3, z, z2, z3, z4);
    }

    public SuppressGAOptionHandler() {
        super(3, false, false, false, false);
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
