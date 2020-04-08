package org.apache.http.impl.conn;

import java.net.InetAddress;
import org.apache.http.conn.DnsResolver;

public class SystemDefaultDnsResolver implements DnsResolver {
    public static final SystemDefaultDnsResolver INSTANCE = new SystemDefaultDnsResolver();

    static {
    }

    public InetAddress[] resolve(String str) {
        return InetAddress.getAllByName(str);
    }
}
