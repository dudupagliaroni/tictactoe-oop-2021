package com.eduardo.jogo;

public class GameBoard {

    private int gameBoard[] = new int[9];

    private final int[] row1 = { 0, 1, 2 };
    private final int[] row2 = { 3, 4, 5 };
    private final int[] row3 = { 6, 7, 8 };
    private final int[] column1 = { 0, 3, 6 };
    private final int[] column2 = { 1, 4, 7 };
    private final int[] column3 = { 2, 5, 8 };
    private final int[] diagonal1 = { 0, 4, 8 };
    private final int[] diagonal2 = { 2, 4, 6 };
    private final int[] boardCornersAndCenter = { 0, 2, 4, 6, 8 };
    private final int[] allPositions = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
    private final int[][] allLines = { row1, row2, row3, column1, column2, column3, diagonal1, diagonal2 };

    public int[] getGameboard() {
        return gameBoard;
    }

    public int[][] getAllLines() {
        return allLines;
    }


    public void upDateGameBoard(Player player, GameBoard gameBoard) {

        switch (player.getPlayerType()) {
            case PLAYER_ONE -> {
                gameBoard.getGameboard()[player.getPositionThePlayerChose()] = 1;
            }
            case PLAYER_TWO, PLAYER_BOT -> {
                gameBoard.getGameboard()[player.getPositionThePlayerChose()] = -1;
            }
            default -> {
                throw new IllegalStateException("Unexpected value: " + player.getPlayerType());
            }
        }
        

    }

    public void printBoard() {
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (gameBoard[k]) {
                    case 0 -> System.out.print(" _ ");
                    case 1 -> System.out.print(" X ");
                    case -1 -> System.out.print(" O ");
                }
                k++;
            }
            System.out.println();
            System.out.println("---------");
        }
        System.out.println();
    }

    public int[] getAllPositions() {
        return allPositions;
    }
}
