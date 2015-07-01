package io.github.spyroo.logs.factory;

import io.github.spyroo.logs.structure.network.UdpConnection;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

public class UdpConnectionWarehouse implements Warehouse<UdpConnection, Integer>{

    private ArrayList<UdpConnection> udpConnectionList;

    protected UdpConnectionWarehouse(){
        udpConnectionList = new ArrayList<UdpConnection>();
    }

    public Integer store(UdpConnection obj) {
        udpConnectionList.add(obj);
        return udpConnectionList.size() - 1;
    }

    public UdpConnection discard(Integer id) {
        return udpConnectionList.remove(id.intValue());
    }

    public List<UdpConnection> getInventory() {
        return udpConnectionList;
    }

    public int size() {
        return udpConnectionList.size();
    }


    public UdpConnection searchForExistingConnection(InetAddress address){
        for(UdpConnection connection : udpConnectionList){
            if(connection.getHost().equals(address)){
                return connection;
            }
        }
        return null;
    }

}
