package com.eduardo.jogo;

import java.util.Random;

public class RoundLoop {


    private PrintUtil printUtil = new PrintUtil();


    public GameState roundLoop(GameBoard gameBoard, GameSetUp gameSetUp) {

        Player currentPlayer = selectRandomPlayer(gameSetUp);
        BoardChecker boardChecker = new BoardChecker();

        while (gameSetUp.getGameState() == GameState.PLAYING) {

            if (gameBoard.upDateGameBoard(currentPlayer, currentPlayer.playerMove(gameBoard, currentPlayer), gameBoard) == false){
                continue;
            };

            printUtil.printMarkingBoard(gameBoard);
            System.out.println(boardChecker.checkGameBoard(gameBoard));
            gameSetUp.upDateGameState(boardChecker.checkGameBoard(gameBoard));
            currentPlayer = nextPlayer(currentPlayer, gameSetUp);

        }
        return gameSetUp.getGameState();
    }


    public Player nextPlayer(Player player, GameSetUp gameSetUp) {
        switch (player.getPlayerNumber()) {
            case PLAYER_1 -> {
                return gameSetUp.getPlayers()[1];
            }
            case PLAYER_2 -> {
                return gameSetUp.getPlayers()[0];
            }
            default -> throw new IllegalStateException("Unexpected value: " + player.getPlayerType());
        }
    }

    public Player selectRandomPlayer(GameSetUp gameSetUp) {
        return gameSetUp.getPlayers()[new Random().nextInt(gameSetUp.getPlayers().length)];
    }

}
