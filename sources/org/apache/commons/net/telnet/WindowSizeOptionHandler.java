package org.apache.commons.net.telnet;

public class WindowSizeOptionHandler extends TelnetOptionHandler {
    protected static final int WINDOW_SIZE = 31;
    private int m_nHeight = 24;
    private int m_nWidth = 80;

    public WindowSizeOptionHandler(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        super(31, z, z2, z3, z4);
        this.m_nWidth = i;
        this.m_nHeight = i2;
    }

    public WindowSizeOptionHandler(int i, int i2) {
        super(31, false, false, false, false);
        this.m_nWidth = i;
        this.m_nHeight = i2;
    }

    public int[] answerSubnegotiation(int[] iArr, int i) {
        return null;
    }

    public int[] startSubnegotiationLocal() {
        int i = (this.m_nWidth * 65536) + this.m_nHeight;
        int i2 = 5;
        if (this.m_nWidth % 256 == 255) {
            i2 = 5 + 1;
        }
        if (this.m_nWidth / 256 == 255) {
            i2++;
        }
        if (this.m_nHeight % 256 == 255) {
            i2++;
        }
        if (this.m_nHeight / 256 == 255) {
            i2++;
        }
        int[] iArr = new int[i2];
        iArr[0] = 31;
        int i3 = 1;
        int i4 = 24;
        while (i3 < i2) {
            iArr[i3] = (i & (255 << i4)) >>> i4;
            if (iArr[i3] == 255) {
                i3++;
                iArr[i3] = 255;
            }
            i3++;
            i4 -= 8;
        }
        return iArr;
    }

    public int[] startSubnegotiationRemote() {
        return null;
    }
}
