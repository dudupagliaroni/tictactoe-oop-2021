package com.eduardo.jogo;

import java.util.Random;

public class RoundLoop {


    private PrintUtil printUtil = new PrintUtil();

    public GameState roundLoop(GameBoard gameBoard, GameSetUp gameSetUp) {

        Player currentPlayer = selectRandomPlayer(gameSetUp);

        if (gameSetUp.getGameState() == GameState.PLAYING) {
            do {

                currentPlayer.setPositionThePlayerChose(currentPlayer.playerMove(gameBoard, currentPlayer));
                gameBoard.upDateGameBoard(currentPlayer, gameBoard);
                printUtil.printBoard(gameBoard);
                nextPlayer(currentPlayer);


                // verificar ganhador
                // trocar próximo jogador
                // retornar gameState

                gameSetUp.setGameState(GameState.TIE);

            } while (gameSetUp.getGameState() == GameState.PLAYING);
        }
        return GameState.PLAYING;
    }


    public PlayerType nextPlayer(Player player) {
        switch (player.getPlayerType()) {
            case PLAYER_ONE -> {
                return PlayerType.PLAYER_TWO;
            }
            case PLAYER_TWO, PLAYER_BOT -> {
                return PlayerType.PLAYER_ONE;
            }
            default -> throw new IllegalStateException("Unexpected value: " + player.getPlayerType());
        }
    }

    public Player selectRandomPlayer(GameSetUp gameSetUp) {
        int random = new Random().nextInt(gameSetUp.getPlayers().length);
        System.out.println(gameSetUp.getPlayers()[random].getPlayerType());
        return gameSetUp.getPlayers()[random];
    }

}
