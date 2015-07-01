package io.github.spyroo.logs.structure.network;

import io.github.spyroo.logs.factory.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpListener implements Runnable {

    private static final Logger logger = LogManager.getLogger(UdpListener.class);

    private DatagramSocket socket;
    public static final int PORT = 8965;

    private UdpConnectionWarehouse udpConnectionWarehouse;
    private UdpConnectionFactory udpConnectionFactory;
    private LogLineFactory logLineFactory;

    public UdpListener() {
        try {
            socket = new DatagramSocket(PORT);
            logger.info(String.format("Created DatagramSocket on port %d", PORT));
            WarehouseFactory warehouseFactory = new WarehouseFactory();
            FactoryFactory factoryFactory = new FactoryFactory();
            udpConnectionWarehouse = (UdpConnectionWarehouse) warehouseFactory.create("udpconnection");
            udpConnectionFactory = (UdpConnectionFactory) factoryFactory.createFactory("udpconnection");
            logLineFactory = (LogLineFactory) factoryFactory.createFactory("logline");

        }catch(SocketException ex){
            logger.error("Error opening DatagramSocket", ex);
        }
    }

    public void run() {
        try {
            byte[] buf = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            while(true) {

                UdpConnection connection = udpConnectionWarehouse.searchForExistingConnection(packet.getAddress());
                if(connection == null){
                    udpConnectionWarehouse.store(udpConnectionFactory.create(packet.getAddress()));
                }
                socket.receive(packet);
                String rec = new String(packet.getData(), 0, packet.getLength()).replaceAll("\n", "");
                connection.getLogLineWarehouse().store(logLineFactory.create(rec));

                /*

                logger.trace(rec);
                List<String> tokens = Arrays.asList(rec.split(" "));
                logger.trace(tokens);
                */

            }
        }catch(IOException ex){
            logger.error("IOException when reading Datagram packet", ex);
        }
    }
}
