package io.github.spyroo.logs.structure.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpListener implements Runnable {

    private DatagramSocket socket;

    public UdpListener() {
        try {
            socket = new DatagramSocket(8965);
        }catch(SocketException ex){

        }
    }

    @Override
    public void run() {
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
        String rec = new String(packet.getData(), 0, packet.getLength()).replaceAll("\n", "");
    }
}
