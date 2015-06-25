package io.github.spyroo.logs.structure.network;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UdpListener implements Runnable {

    private static final Logger logger = LogManager.getLogger(UdpListener.class);

    private DatagramSocket socket;
    public static final int PORT = 8965;

    public UdpListener() {
        try {
            socket = new DatagramSocket(PORT);
            logger.info(String.format("Created DatagramSocket on port %d", PORT));
        }catch(SocketException ex){
            logger.error("Error opening DatagramSocket", ex);
        }
    }

    public void run() {
        try {
            byte[] buf = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            while(true) {
                socket.receive(packet);
                String rec = new String(packet.getData(), 0, packet.getLength()).replaceAll("\n", "");
                logger.trace(rec);
                List<String> tokens = Arrays.asList(rec.split(" "));
                logger.trace(tokens);
            }
        }catch(IOException ex){
            logger.error("IOException when reading Datagram packet", ex);
        }
    }
}
