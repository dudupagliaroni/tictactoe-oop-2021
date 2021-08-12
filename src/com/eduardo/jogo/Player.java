package com.eduardo.jogo;

public abstract class Player {

    protected PlayerMark playerMark;
    protected int points;
    protected String name;

    abstract int move(GameBoard board);

    public Player.PlayerMark getPlayerMark() {
        return playerMark;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public void updatePoints(int points) {
        this.points += points;
    }

    public enum PlayerMark {
        O, X, E
    }

}
