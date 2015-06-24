package io.github.spyroo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Main {

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(8965);
            while(true) {
                byte[] buf = new byte[1024];
                DatagramPacket packet = new DatagramPacket(buf, buf.length);
                socket.receive(packet);
                String rec = new String(packet.getData(), 0, packet.getLength());
                if(rec.length() > 1) {
                    System.out.println(rec.replaceAll("\n", ""));
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
