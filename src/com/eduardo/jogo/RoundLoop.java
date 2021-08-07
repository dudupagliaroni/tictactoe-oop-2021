package com.eduardo.jogo;

import java.util.Random;

public class RoundLoop {


    private PrintUtil printUtil = new PrintUtil();


    public GameState roundLoop(GameBoard gameBoard, GameSetUp gameSetUp) {

        Player currentPlayer = selectRandomPlayer(gameSetUp);

        if (gameSetUp.getGameState() == GameState.PLAYING) {
            do {

                gameBoard.upDateGameBoard(currentPlayer, currentPlayer.playerMove(gameBoard, currentPlayer), gameBoard);
                printUtil.printMarkingBoard(gameBoard);
                currentPlayer = nextPlayer(currentPlayer, gameSetUp);

                // verificar ganhador
                // trocar próximo jogador
                // retornar gameState
                currentPlayer = nextPlayer(currentPlayer, gameSetUp);

            } while (gameSetUp.getGameState() == GameState.PLAYING);
        }
        return GameState.PLAYING;
    }


    public Player nextPlayer(Player player, GameSetUp gameSetUp) {
        switch (player.getPlayerType()) {
            case PLAYER_ONE -> {
                return gameSetUp.getPlayers()[1];
            }
            case PLAYER_TWO, PLAYER_BOT -> {
                return gameSetUp.getPlayers()[0];
            }
            default -> throw new IllegalStateException("Unexpected value: " + player.getPlayerType());
        }
    }

    public Player selectRandomPlayer(GameSetUp gameSetUp) {
        return gameSetUp.getPlayers()[new Random().nextInt(gameSetUp.getPlayers().length)];
    }

}
