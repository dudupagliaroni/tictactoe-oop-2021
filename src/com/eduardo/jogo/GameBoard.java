package com.eduardo.jogo;

public class GameBoard {

    int[] gameboard = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    public int[] getGameboard() {
        return gameboard;
    }

    public GameBoard upDateGameBoard(int playerMove, GameBoard board) {
        return board;
    }
}
