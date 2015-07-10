package io.github.spyroo.logs.structure;

import io.github.spyroo.logs.factory.PlayerWarehouse;

public class LogLineKill extends LogLine{

    private Player killer, victim;

    public LogLineKill(PlayerWarehouse players, String rawContent, Player killer, Player victim){
        super(players, rawContent);
        this.killer = killer;
        this.victim = victim;
    }

    public Player getKiller() {
        return killer;
    }

    public void setKiller(Player killer) {
        this.killer = killer;
    }

    public Player getVictim() {
        return victim;
    }

    public void setVictim(Player victim) {
        this.victim = victim;
    }
}
