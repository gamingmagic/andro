package org.apache.http.util;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

public final class NetUtils {
    public static void formatAddress(StringBuilder sb, SocketAddress socketAddress) {
        Args.notNull(sb, "Buffer");
        Args.notNull(socketAddress, "Socket address");
        if (socketAddress instanceof InetSocketAddress) {
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
            InetSocketAddress inetSocketAddress2 = inetSocketAddress;
            InetAddress address = inetSocketAddress.getAddress();
            sb.append(address != 0 ? address.getHostAddress() : address).append(':').append(inetSocketAddress2.getPort());
            return;
        }
        sb.append(socketAddress);
    }
}
