package com.eduardo.jogo;

import static com.eduardo.jogo.PlayerNumber.PlayerMark.O;
import static com.eduardo.jogo.PlayerNumber.PlayerMark.X;

public abstract class Player {

    protected PlayerNumber playerNumber;
    protected int points;
    protected String name;

    abstract int move(GameBoard board);

    public PlayerNumber getNumber() {
        return playerNumber;
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


    public enum PlayerNumber {

        PLAYER_1(X), PLAYER_2(O);

        private PlayerMark mark;

        public com.eduardo.jogo.PlayerNumber.PlayerMark getMark() {
            return mark;
        }

        PlayerNumber(PlayerMark mark) {
            this.mark = mark;
        }
    }


    public enum PlayerMark {
        O, X, E
    }

}
