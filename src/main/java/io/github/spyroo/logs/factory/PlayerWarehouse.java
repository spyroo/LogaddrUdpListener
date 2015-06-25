package io.github.spyroo.logs.factory;

import io.github.spyroo.logs.structure.Player;

import java.util.ArrayList;
import java.util.List;

public class PlayerWarehouse implements Warehouse<Player, Integer>{

    private ArrayList<Player> playerList;

    protected PlayerWarehouse(){
        playerList = new ArrayList<Player>();
    }

    public Integer store(Player obj) {
        playerList.add(obj);
        return playerList.size()-1;
    }

    public Player discard(Integer id) {
        Player p = playerList.get(id);
        playerList.remove(id.intValue());
        return p;
    }

    public List<Player> getInventory() {
        return playerList;
    }

    public int size() {
        return playerList.size();
    }

}
