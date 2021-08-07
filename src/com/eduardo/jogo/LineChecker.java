package com.eduardo.jogo;

public class LineChecker {


    public PlayerType checkIfThereIsWinner(GameBoard gameBoard) {

        for (int[] line : gameBoard.getAllLines()) {
            int numOfMarksPlayer1 = 0;
            int numOfMarksPlayer2 = 0;

            for (int index : line) {

                if (gameBoard.getGameboard()[index] == PlayerMarking.X) {
                    numOfMarksPlayer1++;
                }
                if (gameBoard.getGameboard()[index] == PlayerMarking.O) {
                    numOfMarksPlayer2++;
                }
            }
            if (numOfMarksPlayer1 == 3) {
                return PlayerType.PLAYER_ONE;
            }

            if (numOfMarksPlayer2 == 3) {
                return PlayerType.PLAYER_TWO;
            }

    }
}


}
