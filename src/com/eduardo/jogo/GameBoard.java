package com.eduardo.jogo;

import java.util.Arrays;

public class GameBoard {

    private final int[] row1 = {0, 1, 2};
    private final int[] row2 = {3, 4, 5};
    private final int[] row3 = {6, 7, 8};
    private final int[] column1 = {0, 3, 6};
    private final int[] column2 = {1, 4, 7};
    private final int[] column3 = {2, 5, 8};
    private final int[] diagonal1 = {0, 4, 8};
    private final int[] diagonal2 = {2, 4, 6};
    private final int[] boardCornersAndCenter = {0, 2, 4, 6, 8};
    private final int[] allPositions = {0, 1, 2, 3, 4, 5, 6, 7, 8};
    private final int[][] allLines = {row1, row2, row3, column1, column2, column3, diagonal1, diagonal2};


    private PlayerMarking[] gameBoard = new PlayerMarking[9];


    public GameBoard() {
        this.gameBoard = initGameBoard();
    }

    public boolean upDateGameBoard(Player player, int position, GameBoard gameBoard) {
        if (gameBoard.getGameboard()[position] == PlayerMarking.E) {
            gameBoard.getMarkingBoard()[position] = player.getPlayerMarking();
            return true;
        } else {
            return false;
        }
    }


    public PlayerMarking[] getGameboard() {
        return gameBoard;
    }

    public PlayerMarking[] initGameBoard() {
        Arrays.fill(gameBoard, PlayerMarking.E);
        return gameBoard;
    }

    public PlayerMarking[] getMarkingBoard() {
        return gameBoard;
    }

    public int[][] getAllLines() {
        return allLines;
    }

    public int[] getAllPositions() {
        return allPositions;
    }

    public void setGameBoard(PlayerMarking[] playerMarkings) {

        for (int i = 0; i < gameBoard.length; i++) {
            gameBoard[i] = playerMarkings[i];
        }

    }
}
