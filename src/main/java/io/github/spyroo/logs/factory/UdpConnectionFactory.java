package io.github.spyroo.logs.factory;

import io.github.spyroo.logs.structure.network.UdpConnection;


public class UdpConnectionFactory implements Factory<UdpConnection, String>{

    protected UdpConnectionFactory(){

    }

    public UdpConnection create(String arg) {
        return new UdpConnection(arg);
    }
}
