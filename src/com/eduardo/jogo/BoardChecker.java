package com.eduardo.jogo;

public class BoardChecker {


    public GameState checkGameBoard(GameBoard gameBoard) {
        GameState gameState = GameState.PLAYING;
        gameState = checkTie(gameBoard);

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
                gameState = GameState.X_WINS;
            }

            if (numOfMarksPlayer2 == 3) {
                gameState = GameState.O_WINS;
            }
        }
        return gameState;
    }

    public GameState checkTie(GameBoard gameBoard) {
        GameState gameState = GameState.PLAYING;

        if (thereIsSpotEmpty(gameBoard)) {
            gameState = GameState.PLAYING;
        } else {
            gameState = GameState.TIE;
        }
        return gameState;
    }

    public boolean thereIsSpotEmpty(GameBoard gameBoard) {
        for (PlayerMarking marking : gameBoard.getGameboard()) {
            if (marking == PlayerMarking.E) {
                return true;
            }
        }
        return false;
    }
}

