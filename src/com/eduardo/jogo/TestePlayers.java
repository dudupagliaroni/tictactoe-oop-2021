package com.eduardo.jogo;

public class TestePlayers {

    public static void main(String[] args) {

        GameBoard gameBoard = new GameBoard();
        Player player1 = new Player(PlayerType.PLAYER_ONE, "Dudu");
        Player player2 = new Player(PlayerType.PLAYER_TWO, "Daniel");
        Player playerBot = new Player(PlayerType.PLAYER_BOT, "Robozinho");
        GameSetUp gameSetUp = new GameSetUp(player1, playerBot, GameMode.PVC, gameBoard);

        RoundLoop roundLoop = new RoundLoop();

        roundLoop.roundLoop(gameBoard, gameSetUp);

    }


}
