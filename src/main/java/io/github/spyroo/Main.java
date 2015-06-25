package io.github.spyroo;

import io.github.spyroo.logs.structure.network.UdpListener;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Main {

    public static void main(String[] args) {
        UdpListener listener = new UdpListener();
        Thread t = new Thread(listener);
        t.start();
    }
}
