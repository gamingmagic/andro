package org.apache.http.conn.scheme;

import java.net.InetAddress;

@Deprecated
public interface HostNameResolver {
    InetAddress resolve(String str);
}
