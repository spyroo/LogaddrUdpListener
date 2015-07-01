package io.github.spyroo.logs.factory;

public class WarehouseFactory implements Factory<Warehouse, String>{

    public Warehouse create(String arg) {
        if(arg.equalsIgnoreCase("logline")) {
            return new LogLineWarehouse();
        }
        if(arg.equalsIgnoreCase("player")){
            return new PlayerWarehouse();
        }
        if(arg.equalsIgnoreCase("udpconnection")){
            return  new UdpConnectionWarehouse();
        }
        return null;
    }
}
