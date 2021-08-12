package com.eduardo.jogo;

import java.util.Arrays;

import static com.eduardo.jogo.GameState.O_WINS;
import static com.eduardo.jogo.GameState.X_WINS;
import static com.eduardo.jogo.Player.PlayerMark.*;

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

        if (isAnySpotEmpty(gameBoard)) {
            gameState = GameState.PLAYING;
        } else {
            gameState = GameState.TIE;
        }
        return gameState;
    }

    private boolean isAnySpotEmpty(GameBoard gameBoard) {
        return Arrays.stream(gameBoard.getGameboard()).anyMatch(marking -> marking == Player.PlayerMark.E);
    }
}

