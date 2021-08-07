package com.eduardo.jogo;

public class GameSetUp {

    private Player player1;
    private Player player2;
    private GameBoard gameBoard;
    private GameState gameState;

    public GameSetUp(Player player1, Player player2, GameBoard gameBoard) {
        this.player1 = player1;
        this.player2 = player2;
        this.gameBoard = gameBoard;
        this.gameState = GameState.PLAYING;

    }

    public Player[] getPlayers() {
        return new Player[]{this.player1, this.player2};
    }

    public void upDateGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public GameBoard getGameBoard() {
        return gameBoard;
    }

    public GameState getGameState() {
        return gameState;
    }


}
