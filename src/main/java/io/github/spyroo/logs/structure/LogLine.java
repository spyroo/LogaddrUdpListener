package io.github.spyroo.logs.structure;

import io.github.spyroo.logs.factory.PlayerWarehouse;


public class LogLine {

    private PlayerWarehouse players;
    private String rawContent;

    public LogLine(PlayerWarehouse players, String rawContent) {
        this.players = players;
        this.rawContent = rawContent;
    }

    public PlayerWarehouse getPlayers() {
        return players;
    }

    public void setPlayers(PlayerWarehouse players) {
        this.players = players;
    }

    public String getRawContent() {
        return rawContent;
    }

    public void setRawContent(String rawContent) {
        this.rawContent = rawContent;
    }

}
