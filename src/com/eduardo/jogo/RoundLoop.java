package com.eduardo.jogo;

public class RoundLoop {

    public void roundLoop(GameBoard board, GameSetUp gameSetUp) {

        switch (gameSetUp.getGameMode()) {
            case PVC: {
                System.out.println("Modo PVC");
            }
            case PVP: {
                System.out.println("Modo PVC");
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

}
