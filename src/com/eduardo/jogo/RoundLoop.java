package com.eduardo.jogo;

import java.util.Random;

public class RoundLoop {

    public void roundLoop(GameBoard gameBoard, GameSetUp gameSetUp) {

        Player currentPlayer = selectRandomPlayer(gameSetUp);

        if (gameSetUp.getGameState() == GameState.PLAYING) {

            switch (gameSetUp.getGameMode()) {
                case PVP: {
                    currentPlayer.setPositionThePlayerChose(currentPlayer.playerMove(gameBoard,currentPlayer));
                    gameBoard.upDateGameBoard(currentPlayer, gameBoard);
                    PrintUtil printUtil = new PrintUtil();
                    printUtil.printBoard(gameBoard);
                    System.out.println("case pvp");
                    // verificar ganhador
                    // trocar próximo jogador
                    // retornar gameState


                }
                case PVC: {
                    System.out.println("case pvc");

                }

                default: {
                    System.out.println(0);
                }
            }
        }
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
        System.out.println(random);
        return gameSetUp.getPlayers()[random];
    }

}
