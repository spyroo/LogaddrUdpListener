package io.github.spyroo.logs.factory;

public class WarehouseFactory implements Factory<Warehouse, String>{

    @Override
    public Warehouse create(String arg) {
        if(arg.equalsIgnoreCase("logline")) {
            return new LogLineWarehouse();
        }
        if(arg.equalsIgnoreCase("player")){
            return new PlayerWarehouse();
        }
        return null;
    }
}
