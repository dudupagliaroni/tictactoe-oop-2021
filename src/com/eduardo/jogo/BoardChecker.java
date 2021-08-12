package com.eduardo.jogo;

import com.eduardo.jogo.PlayerNumber.PlayerMark;

import static com.eduardo.jogo.GameState.O_WINS;
import static com.eduardo.jogo.GameState.X_WINS;
import static com.eduardo.jogo.PlayerNumber.PlayerMark.*;

public class BoardChecker {

    public GameState checkGameState(GameBoard gameBoard) {
        GameState gameState = GameState.PLAYING;
        gameState = checkTie(gameBoard);

        for (int[] line : gameBoard.getAllLines()) {
            int numOfMarksPlayer1 = 0;
            int numOfMarksPlayer2 = 0;

            for (int index : line) {

                if (gameBoard.getGameboard()[index] == X) {
                    numOfMarksPlayer1++;
                }
                if (gameBoard.getGameboard()[index] == O) {
                    numOfMarksPlayer2++;
                }
            }

            if (numOfMarksPlayer1 == 3) {
                gameState = X_WINS;
            }

            if (numOfMarksPlayer2 == 3) {
                gameState = O_WINS;
            }
        }
        return gameState;
    }

    private GameState checkTie(GameBoard gameBoard) {
        GameState gameState = GameState.PLAYING;

        if (isSpotEmpty(gameBoard)) {
            gameState = GameState.PLAYING;
        } else {
            gameState = GameState.TIE;
        }
        return gameState;
    }

    private boolean isSpotEmpty(GameBoard gameBoard) {
        for (PlayerMark marking : gameBoard.getGameboard()) {
            if (marking == E) {
                return true;
            }
        }
        return false;
    }
}

