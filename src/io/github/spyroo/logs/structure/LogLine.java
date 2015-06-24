package io.github.spyroo.logs.structure;

import java.util.ArrayList;

public class LogLine {

    private ArrayList<Player> players;
    private String rawContent;
    private LogLineType type;

    public LogLine(ArrayList<Player> players, String rawContent, LogLineType type) {
        this.players = players;
        this.rawContent = rawContent;
        this.type = type;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
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
