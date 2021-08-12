package com.eduardo.jogo;

import java.util.Random;

import static com.eduardo.jogo.RoundState.PLAYING;

public class Round {

    private PrintUtil printUtil = new PrintUtil();

    private RoundState roundState = PLAYING;

    private GameBoard board = new GameBoard();

    public RoundState runLoop(Player player1, Player player2) {
        Player currentPlayer = new Player[]{ player1, player2 }[ new Random().nextInt(2) ];
        BoardChecker boardChecker = new BoardChecker();

        while (roundState == PLAYING) {
            if (board.updateGameBoard(currentPlayer, currentPlayer.move(board)) == false) {
                continue;
            }

            printUtil.printBoard(board);
            roundState = boardChecker.checkGameState(board);
            currentPlayer = nextPlayer(currentPlayer, player1, player2);
        }
        return roundState;
    }

    private Player nextPlayer(Player player, Player player1, Player player2) {
        switch (player.getPlayerMark()) {
            case X -> {
                return player2;
            }
            case O -> {
                return player1;
            }
            default -> throw new IllegalStateException("Unexpected value: " + player.getPlayerMark());
        }
    }

}
