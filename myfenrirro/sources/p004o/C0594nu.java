package p004o;

import android.net.wifi.WifiManager;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: o.nu */
public final class C0594nu {
    /* renamed from: 鷭 */
    private static String m682(String str) {
        NetworkInterface networkInterface;
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            do {
                if (it.hasNext()) {
                    networkInterface = (NetworkInterface) it.next();
                    if (str == null) {
                        break;
                    }
                } else {
                    return "";
                }
            } while (!networkInterface.getName().equalsIgnoreCase(str));
            byte[] hardwareAddress = networkInterface.getHardwareAddress();
            if (hardwareAddress == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (byte valueOf : hardwareAddress) {
                sb.append(String.format("%02X:", new Object[]{Byte.valueOf(valueOf)}));
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        } catch (Exception unused) {
        }
    }

    /* renamed from: 鷭 */
    public static String m681() {
        String r2 = m682("wlan0");
        if (r2 == null || r2.length() <= 0) {
            r2 = m682("eth0");
        }
        if (r2 == null || r2.length() <= 0) {
            r2 = ((WifiManager) C1014.f6147.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        }
        if (r2 == null) {
            return "";
        }
        return r2;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 119 */
    /* renamed from: 櫯 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m680() {
        /*
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ Exception -> 0x0049 }
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch:{ Exception -> 0x0049 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x0049 }
            goto L_0x0042
        L_0x000d:
            java.lang.Object r0 = r2.next()     // Catch:{ Exception -> 0x0049 }
            java.net.NetworkInterface r0 = (java.net.NetworkInterface) r0     // Catch:{ Exception -> 0x0049 }
            java.util.Enumeration r0 = r0.getInetAddresses()     // Catch:{ Exception -> 0x0049 }
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch:{ Exception -> 0x0049 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ Exception -> 0x0049 }
            goto L_0x003c
        L_0x0020:
            java.lang.Object r0 = r3.next()     // Catch:{ Exception -> 0x0049 }
            java.net.InetAddress r0 = (java.net.InetAddress) r0     // Catch:{ Exception -> 0x0049 }
            r1 = r0
            boolean r0 = r1.isLoopbackAddress()     // Catch:{ Exception -> 0x0049 }
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = r1.getHostAddress()     // Catch:{ Exception -> 0x0049 }
            java.lang.String r1 = r0.toUpperCase()     // Catch:{ Exception -> 0x0049 }
            boolean r0 = org.apache.http.conn.util.InetAddressUtils.isIPv4Address(r1)     // Catch:{ Exception -> 0x0049 }
            if (r0 == 0) goto L_0x003c
            return r1
        L_0x003c:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x0049 }
            if (r0 != 0) goto L_0x0020
        L_0x0042:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x0049 }
            if (r0 != 0) goto L_0x000d
        L_0x0049:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004o.C0594nu.m680():java.lang.String");
    }
}
