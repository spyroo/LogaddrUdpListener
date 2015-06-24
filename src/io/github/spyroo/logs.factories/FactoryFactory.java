package io.github.spyroo.logs.factories;

public class FactoryFactory {

    public Factory createFactory(String factoryType){
        if(factoryType.equalsIgnoreCase("logline")){
            return new LogLineFactory();
        }
        if(factoryType.equalsIgnoreCase("player")){
            return new PlayerFactory();
        }
        return null;
    }

}
