package com.eduardo.jogo;

public class TestGame {

    public static void main(String[] args) {

        GameBoard gameBoard = new GameBoard();
//
//        PlayerMarking[] playerMarkings = {
//                PlayerMarking.X, PlayerMarking.O, PlayerMarking.X,
//                PlayerMarking.X, PlayerMarking.O, PlayerMarking.X,
//                PlayerMarking.O, PlayerMarking.X, PlayerMarking.O
//        };
//
//        gameBoard.setGameBoard(playerMarkings);


        Player player1 = new Player(PlayerType.PLAYER_BOT, PlayerNumber.PLAYER_1, "Dudu");
        Player player2 = new Player(PlayerType.PLAYER_HUMAN, PlayerNumber.PLAYER_2, "Daniel");
        Player player3 = new Player(PlayerType.PLAYER_BOT, PlayerNumber.PLAYER_2, "Botzera");

        GameSetUp gameSetUp = new GameSetUp(player1, player3, gameBoard);

        GameCore game = new GameCore();

        game.gameLoop(gameSetUp, gameBoard, 3);


    }


}
