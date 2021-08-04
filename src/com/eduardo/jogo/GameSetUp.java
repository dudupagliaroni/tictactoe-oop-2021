package com.eduardo.jogo;

public class GameSetUp {
    
    private Player player1;
    private Player player2;
    private GameMode gameMode;
    private GameBoard gameBoard;
    private GameState gameState;
    private Player[] players = new Player[2];

//    Player player1 = new Player(PlayerType.PLAYER_ONE, "Dudu");
//    Player player2 = new Player(PlayerType.PLAYER_BOT, "Robozinho");
//    GameBoard gameBoard = new GameBoard();
//    GameMode gameMode = GameMode.PVP;

    public GameSetUp(Player player1, Player player2, GameMode gameMode, GameBoard gameBoard) {
        this.player1 = player1;
        this.player2 = player2;
        this.gameMode = gameMode;
        this.gameBoard = gameBoard;
        this.gameState = GameState.PLAYING;
        this.players = getPlayers();
    }


    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public Player[] getPlayers() {
       return new Player[]{this.player1, this.player2};
    }

    public GameBoard getGameBoard() {
        return gameBoard;
    }

    public GameMode getGameMode() {
        return gameMode;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
}
