package io.github.spyroo.logs.structure;

public class Player {

    private String userid;
    private PlayerClass playerClass;


    public Player(String userid, PlayerClass playerClass) {
        this.userid = userid;
        this.playerClass = playerClass;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public PlayerClass getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(PlayerClass playerClass) {
        this.playerClass = playerClass;
    }
}
