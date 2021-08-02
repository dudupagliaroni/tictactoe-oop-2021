package com.eduardo.jogo;

public class GameSetUp {
    
//    Player player1;
//    Player player2;
//    GameMode gameMode;
//    GameBoard gameBoard;

    Player player1 = new Player(PlayerType.PLAYER_ONE, "Dudu");
    Player player2 = new Player(PlayerType.BOT, "Robozinho");
    GameBoard gameBoard = new GameBoard();
    GameMode gameMode = GameMode.PVP;

//    public GameSetUp(Player player1, Player player2, GameMode gameMode, GameBoard gameBoard) {
//        this.player1 = player1;
//        this.player2 = player2;
//        this.gameMode = gameMode;
//        this.gameBoard = gameBoard;
//    }


    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public GameBoard getGameBoard() {
        return gameBoard;
    }

    public GameMode getGameMode() {
        return gameMode;
    }
    
    public Player nextPlayer(Player player){
        switch (player.getMarkType()) {
            case X -> {
                return getPlayer2();
            }
            case O -> {
                return getPlayer1();
            }
            default -> throw new IllegalStateException("Unexpected value: " + player.getMarkType());
        }

    }
}