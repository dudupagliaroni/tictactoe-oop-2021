package com.eduardo.jogo;

import java.util.Arrays;

import static com.eduardo.jogo.RoundState.O_WINS;
import static com.eduardo.jogo.RoundState.X_WINS;
import static com.eduardo.jogo.Player.PlayerMark.*;

public class BoardChecker {

    public RoundState checkGameState(GameBoard gameBoard) {
        RoundState roundState = RoundState.PLAYING;
        roundState = checkTie(gameBoard);

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
                roundState = X_WINS;
            }

            if (numOfMarksPlayer2 == 3) {
                roundState = O_WINS;
            }
        }
        return roundState;
    }

    private RoundState checkTie(GameBoard gameBoard) {
        RoundState roundState = RoundState.PLAYING;

        if (isAnySpotEmpty(gameBoard)) {
            roundState = RoundState.PLAYING;
        } else {
            roundState = RoundState.TIE;
        }
        return roundState;
    }

    private boolean isAnySpotEmpty(GameBoard gameBoard) {
        return Arrays.stream(gameBoard.getGameboard()).anyMatch(marking -> marking == Player.PlayerMark.E);
    }
}

