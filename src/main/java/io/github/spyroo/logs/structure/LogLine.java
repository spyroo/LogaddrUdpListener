package io.github.spyroo.logs.structure;

import io.github.spyroo.logs.factory.PlayerWarehouse;

import java.util.ArrayList;

public class LogLine {

    private PlayerWarehouse players;
    private String rawContent;
    private LogLineType type;

    public LogLine(PlayerWarehouse players, String rawContent, LogLineType type) {
        this.players = players;
        this.rawContent = rawContent;
        this.type = type;
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

    public LogLineType getType() {
        return type;
    }

    public void setType(LogLineType type) {
        this.type = type;
    }
}
