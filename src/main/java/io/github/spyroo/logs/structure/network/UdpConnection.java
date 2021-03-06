package io.github.spyroo.logs.structure.network;

import io.github.spyroo.logs.factory.LogLineWarehouse;
import io.github.spyroo.logs.factory.PlayerWarehouse;
import io.github.spyroo.logs.factory.WarehouseFactory;

import java.net.InetAddress;

public class UdpConnection {

    private String host;
    private LogLineWarehouse logLineWarehouse;
    private PlayerWarehouse playerWarehouse;

    public UdpConnection(String host){
        this.host = host;
        WarehouseFactory warehouseFactory = new WarehouseFactory();
        logLineWarehouse = (LogLineWarehouse) warehouseFactory.create("logline");
        playerWarehouse = (PlayerWarehouse) warehouseFactory.create("player");
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public LogLineWarehouse getLogLineWarehouse() {
        return logLineWarehouse;
    }

    public void setLogLineWarehouse(LogLineWarehouse logLineWarehouse) {
        this.logLineWarehouse = logLineWarehouse;
    }

    public PlayerWarehouse getPlayerWarehouse() {
        return playerWarehouse;
    }

    public void setPlayerWarehouse(PlayerWarehouse playerWarehouse) {
        this.playerWarehouse = playerWarehouse;
    }
}
