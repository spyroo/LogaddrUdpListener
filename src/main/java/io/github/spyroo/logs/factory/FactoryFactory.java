package io.github.spyroo.logs.factory;

public class FactoryFactory {

    public Factory createFactory(String factoryType){
        if(factoryType.equalsIgnoreCase("logline")){
            return new LogLineFactory();
        }
        if(factoryType.equalsIgnoreCase("player")){
            return new PlayerFactory();
        }
        if(factoryType.equalsIgnoreCase("udpconnection")){
            return new UdpConnectionFactory();
        }
        return null;
    }

}
