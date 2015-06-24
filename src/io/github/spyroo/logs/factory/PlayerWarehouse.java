package io.github.spyroo.logs.factory;

import io.github.spyroo.logs.structure.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerWarehouse implements Warehouse<Player, Integer>{

    private ArrayList<Player> playerList;

    protected PlayerWarehouse(){
        playerList = new ArrayList<>();
    }

    @Override
    public Integer store(Player obj) {
        playerList.add(obj);
        return playerList.size()-1;
    }

    @Override
    public Player discard(Integer id) {
        Player p = playerList.get(id);
        playerList.remove(id.intValue());
        return p;
    }

    @Override
    public List<Player> getInventory() {
        return playerList;
    }

    @Override
    public int size() {
        return playerList.size();
    }

}
