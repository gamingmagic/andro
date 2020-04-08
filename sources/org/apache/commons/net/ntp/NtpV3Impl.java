package org.apache.commons.net.ntp;

import java.net.DatagramPacket;

public class NtpV3Impl implements NtpV3Packet {
    private static final int LI_INDEX = 0;
    private static final int LI_SHIFT = 6;
    private static final int MODE_INDEX = 0;
    private static final int MODE_SHIFT = 0;
    private static final int ORIGINATE_TIMESTAMP_INDEX = 24;
    private static final int POLL_INDEX = 2;
    private static final int PRECISION_INDEX = 3;
    private static final int RECEIVE_TIMESTAMP_INDEX = 32;
    private static final int REFERENCE_ID_INDEX = 12;
    private static final int REFERENCE_TIMESTAMP_INDEX = 16;
    private static final int ROOT_DELAY_INDEX = 4;
    private static final int ROOT_DISPERSION_INDEX = 8;
    private static final int STRATUM_INDEX = 1;
    private static final int TRANSMIT_TIMESTAMP_INDEX = 40;
    private static final int VERSION_INDEX = 0;
    private static final int VERSION_SHIFT = 3;
    private final byte[] buf = new byte[48];

    /* renamed from: dp */
    private volatile DatagramPacket f8990dp;

    public int getMode() {
        return (m2727ui(this.buf[0]) >> 0) & 7;
    }

    public String getModeName() {
        return NtpUtils.getModeName(getMode());
    }

    public void setMode(int i) {
        this.buf[0] = (byte) ((this.buf[0] & 248) | (i & 7));
    }

    public int getLeapIndicator() {
        return (m2727ui(this.buf[0]) >> 6) & 3;
    }

    public void setLeapIndicator(int i) {
        this.buf[0] = (byte) ((this.buf[0] & 63) | ((i & 3) << 6));
    }

    public int getPoll() {
        return this.buf[2];
    }

    public void setPoll(int i) {
        this.buf[2] = (byte) (i & 255);
    }

    public int getPrecision() {
        return this.buf[3];
    }

    public void setPrecision(int i) {
        this.buf[3] = (byte) (i & 255);
    }

    public int getVersion() {
        return (m2727ui(this.buf[0]) >> 3) & 7;
    }

    public void setVersion(int i) {
        this.buf[0] = (byte) ((this.buf[0] & 199) | ((i & 7) << 3));
    }

    public int getStratum() {
        return m2727ui(this.buf[1]);
    }

    public void setStratum(int i) {
        this.buf[1] = (byte) (i & 255);
    }

    public int getRootDelay() {
        return getInt(4);
    }

    public double getRootDelayInMillisDouble() {
        return ((double) getRootDelay()) / 65.536d;
    }

    public int getRootDispersion() {
        return getInt(8);
    }

    public long getRootDispersionInMillis() {
        return (((long) getRootDispersion()) * 1000) / 65536;
    }

    public double getRootDispersionInMillisDouble() {
        return ((double) getRootDispersion()) / 65.536d;
    }

    public void setReferenceId(int i) {
        for (int i2 = 3; i2 >= 0; i2--) {
            this.buf[i2 + 12] = (byte) (i & 255);
            i >>>= 8;
        }
    }

    public int getReferenceId() {
        return getInt(12);
    }

    public String getReferenceIdString() {
        int version = getVersion();
        int stratum = getStratum();
        if (version == 3 || version == 4) {
            if (stratum == 0 || stratum == 1) {
                return idAsString();
            }
            if (version == 4) {
                return idAsHex();
            }
        }
        if (stratum >= 2) {
            return idAsIPAddress();
        }
        return idAsHex();
    }

    private String idAsIPAddress() {
        return m2727ui(this.buf[12]) + "." + m2727ui(this.buf[13]) + "." + m2727ui(this.buf[14]) + "." + m2727ui(this.buf[15]);
    }

    private String idAsString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 3; i++) {
            char c = (char) this.buf[i + 12];
            if (c == 0) {
                break;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    private String idAsHex() {
        return Integer.toHexString(getReferenceId());
    }

    public TimeStamp getTransmitTimeStamp() {
        return getTimestamp(40);
    }

    public void setTransmitTime(TimeStamp timeStamp) {
        setTimestamp(40, timeStamp);
    }

    public void setOriginateTimeStamp(TimeStamp timeStamp) {
        setTimestamp(24, timeStamp);
    }

    public TimeStamp getOriginateTimeStamp() {
        return getTimestamp(24);
    }

    public TimeStamp getReferenceTimeStamp() {
        return getTimestamp(16);
    }

    public void setReferenceTime(TimeStamp timeStamp) {
        setTimestamp(16, timeStamp);
    }

    public TimeStamp getReceiveTimeStamp() {
        return getTimestamp(32);
    }

    public void setReceiveTimeStamp(TimeStamp timeStamp) {
        setTimestamp(32, timeStamp);
    }

    public String getType() {
        return NtpV3Packet.TYPE_NTP;
    }

    private int getInt(int i) {
        return (m2727ui(this.buf[i]) << 24) | (m2727ui(this.buf[i + 1]) << 16) | (m2727ui(this.buf[i + 2]) << 8) | m2727ui(this.buf[i + 3]);
    }

    private TimeStamp getTimestamp(int i) {
        return new TimeStamp(getLong(i));
    }

    private long getLong(int i) {
        return (m2728ul(this.buf[i]) << 56) | (m2728ul(this.buf[i + 1]) << 48) | (m2728ul(this.buf[i + 2]) << 40) | (m2728ul(this.buf[i + 3]) << 32) | (m2728ul(this.buf[i + 4]) << 24) | (m2728ul(this.buf[i + 5]) << 16) | (m2728ul(this.buf[i + 6]) << 8) | m2728ul(this.buf[i + 7]);
    }

    private void setTimestamp(int i, TimeStamp timeStamp) {
        long ntpValue = timeStamp == null ? 0 : timeStamp.ntpValue();
        for (int i2 = 7; i2 >= 0; i2--) {
            this.buf[i + i2] = (byte) ((int) (255 & ntpValue));
            ntpValue >>>= 8;
        }
    }

    public synchronized DatagramPacket getDatagramPacket() {
        if (this.f8990dp == null) {
            this.f8990dp = new DatagramPacket(this.buf, this.buf.length);
            this.f8990dp.setPort(123);
        }
        return this.f8990dp;
    }

    public void setDatagramPacket(DatagramPacket datagramPacket) {
        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        if (length > this.buf.length) {
            length = this.buf.length;
        }
        System.arraycopy(data, 0, this.buf, 0, length);
    }

    /* renamed from: ui */
    protected static final int m2727ui(byte b) {
        return b & 255;
    }

    /* renamed from: ul */
    protected static final long m2728ul(byte b) {
        return (long) (b & 255);
    }

    public String toString() {
        return "[version:" + getVersion() + ", mode:" + getMode() + ", poll:" + getPoll() + ", precision:" + getPrecision() + ", delay:" + getRootDelay() + ", dispersion(ms):" + getRootDispersionInMillisDouble() + ", id:" + getReferenceIdString() + ", xmitTime:" + getTransmitTimeStamp().toDateString() + " ]";
    }
}
