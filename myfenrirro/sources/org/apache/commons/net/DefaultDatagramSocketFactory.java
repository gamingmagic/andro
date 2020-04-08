package org.apache.commons.net;

import java.net.DatagramSocket;
import java.net.InetAddress;

public class DefaultDatagramSocketFactory implements DatagramSocketFactory {
    public DatagramSocket createDatagramSocket() {
        return new DatagramSocket();
    }

    public DatagramSocket createDatagramSocket(int i) {
        return new DatagramSocket(i);
    }

    public DatagramSocket createDatagramSocket(int i, InetAddress inetAddress) {
        return new DatagramSocket(i, inetAddress);
    }
}
