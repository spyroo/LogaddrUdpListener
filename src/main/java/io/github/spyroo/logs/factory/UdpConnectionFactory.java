package io.github.spyroo.logs.factory;

import io.github.spyroo.logs.structure.network.UdpConnection;

import java.net.InetAddress;

public class UdpConnectionFactory implements Factory<UdpConnection, InetAddress>{

    protected UdpConnectionFactory(){

    }

    public UdpConnection create(InetAddress arg) {
        return new UdpConnection(arg);
    }
}
