package org.apache.commons.net.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubnetUtils {
    private static final String IP_ADDRESS = "(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})";
    private static final int NBITS = 32;
    private static final String SLASH_FORMAT = "(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})/(\\d{1,3})";
    private static final Pattern addressPattern = Pattern.compile(IP_ADDRESS);
    private static final Pattern cidrPattern = Pattern.compile(SLASH_FORMAT);
    /* access modifiers changed from: private */
    public int address = 0;
    /* access modifiers changed from: private */
    public int broadcast = 0;
    private boolean inclusiveHostCount = false;
    /* access modifiers changed from: private */
    public int netmask = 0;
    /* access modifiers changed from: private */
    public int network = 0;

    public final class SubnetInfo {
        private SubnetInfo() {
        }

        private int netmask() {
            return SubnetUtils.this.netmask;
        }

        private int network() {
            return SubnetUtils.this.network;
        }

        private int address() {
            return SubnetUtils.this.address;
        }

        private int broadcast() {
            return SubnetUtils.this.broadcast;
        }

        private int low() {
            if (SubnetUtils.this.isInclusiveHostCount()) {
                return network();
            }
            if (broadcast() - network() > 1) {
                return network() + 1;
            }
            return 0;
        }

        private int high() {
            if (SubnetUtils.this.isInclusiveHostCount()) {
                return broadcast();
            }
            if (broadcast() - network() > 1) {
                return broadcast() - 1;
            }
            return 0;
        }

        public final boolean isInRange(String str) {
            return isInRange(SubnetUtils.this.toInteger(str));
        }

        private boolean isInRange(int i) {
            int low = i - low();
            return low >= 0 && low <= high() - low();
        }

        public final String getBroadcastAddress() {
            return SubnetUtils.this.format(SubnetUtils.this.toArray(broadcast()));
        }

        public final String getNetworkAddress() {
            return SubnetUtils.this.format(SubnetUtils.this.toArray(network()));
        }

        public final String getNetmask() {
            return SubnetUtils.this.format(SubnetUtils.this.toArray(netmask()));
        }

        public final String getAddress() {
            return SubnetUtils.this.format(SubnetUtils.this.toArray(address()));
        }

        public final String getLowAddress() {
            return SubnetUtils.this.format(SubnetUtils.this.toArray(low()));
        }

        public final String getHighAddress() {
            return SubnetUtils.this.format(SubnetUtils.this.toArray(high()));
        }

        public final int getAddressCount() {
            int broadcast = (broadcast() - network()) + (SubnetUtils.this.isInclusiveHostCount() ? 1 : -1);
            if (broadcast < 0) {
                return 0;
            }
            return broadcast;
        }

        public final int asInteger(String str) {
            return SubnetUtils.this.toInteger(str);
        }

        public final String getCidrSignature() {
            return SubnetUtils.this.toCidrNotation(SubnetUtils.this.format(SubnetUtils.this.toArray(address())), SubnetUtils.this.format(SubnetUtils.this.toArray(netmask())));
        }

        public final String[] getAllAddresses() {
            int addressCount = getAddressCount();
            String[] strArr = new String[addressCount];
            if (addressCount == 0) {
                return strArr;
            }
            int low = low();
            int i = 0;
            while (low <= high()) {
                strArr[i] = SubnetUtils.this.format(SubnetUtils.this.toArray(low));
                low++;
                i++;
            }
            return strArr;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CIDR Signature:\t[").append(getCidrSignature()).append("] Netmask: [").append(getNetmask()).append("]\nNetwork:\t[").append(getNetworkAddress()).append("]\nBroadcast:\t[").append(getBroadcastAddress()).append("]\nFirst Address:\t[").append(getLowAddress()).append("]\nLast Address:\t[").append(getHighAddress()).append("]\n# Addresses:\t[").append(getAddressCount()).append("]\n");
            return sb.toString();
        }
    }

    static {
    }

    public SubnetUtils(String str) {
        calculate(str);
    }

    public SubnetUtils(String str, String str2) {
        calculate(toCidrNotation(str, str2));
    }

    public boolean isInclusiveHostCount() {
        return this.inclusiveHostCount;
    }

    public void setInclusiveHostCount(boolean z) {
        this.inclusiveHostCount = z;
    }

    public final SubnetInfo getInfo() {
        return new SubnetInfo();
    }

    private void calculate(String str) {
        Matcher matcher = cidrPattern.matcher(str);
        if (matcher.matches()) {
            this.address = matchAddress(matcher);
            int rangeCheck = rangeCheck(Integer.parseInt(matcher.group(5)), 0, 32);
            for (int i = 0; i < rangeCheck; i++) {
                this.netmask |= 1 << (31 - i);
            }
            this.network = this.address & this.netmask;
            this.broadcast = this.network | (this.netmask ^ -1);
            return;
        }
        throw new IllegalArgumentException("Could not parse [" + str + "]");
    }

    /* access modifiers changed from: private */
    public int toInteger(String str) {
        Matcher matcher = addressPattern.matcher(str);
        if (matcher.matches()) {
            return matchAddress(matcher);
        }
        throw new IllegalArgumentException("Could not parse [" + str + "]");
    }

    private int matchAddress(Matcher matcher) {
        int i = 0;
        for (int i2 = 1; i2 <= 4; i2++) {
            i |= (rangeCheck(Integer.parseInt(matcher.group(i2)), -1, 255) & 255) << ((4 - i2) * 8);
        }
        return i;
    }

    /* access modifiers changed from: private */
    public int[] toArray(int i) {
        int[] iArr = new int[4];
        for (int i2 = 3; i2 >= 0; i2--) {
            iArr[i2] = iArr[i2] | ((i >>> ((3 - i2) * 8)) & 255);
        }
        return iArr;
    }

    /* access modifiers changed from: private */
    public String format(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iArr.length; i++) {
            sb.append(iArr[i]);
            if (i != iArr.length - 1) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    private int rangeCheck(int i, int i2, int i3) {
        if (i > i2 && i <= i3) {
            return i;
        }
        throw new IllegalArgumentException("Value [" + i + "] not in range (" + i2 + "," + i3 + "]");
    }

    /* access modifiers changed from: 0000 */
    public int pop(int i) {
        int i2 = i - ((i >>> 1) & 1431655765);
        int i3 = (858993459 & i2) + ((i2 >>> 2) & 858993459);
        int i4 = (i3 + (i3 >>> 4)) & 252645135;
        int i5 = i4 + (i4 >>> 8);
        return (i5 + (i5 >>> 16)) & 63;
    }

    /* access modifiers changed from: private */
    public String toCidrNotation(String str, String str2) {
        return str + "/" + pop(toInteger(str2));
    }
}
