package com.eduardo.jogo;

import java.util.Random;

public class Bot extends Player {

    public Bot(PlayerMark playerMark, String name) {
        super.playerMark = playerMark;
        super.name = name;
        this.points = 0;
    }

    @Override
    public int move(GameBoard board) {
        return board.getAllPositions()[new Random().nextInt(board.getGameboard().length)];
    }

}
