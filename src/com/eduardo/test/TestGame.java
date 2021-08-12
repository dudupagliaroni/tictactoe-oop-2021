package com.eduardo.jogo.test;

import com.eduardo.jogo.*;

import static com.eduardo.jogo.PlayerNumber.*;

public class TestGame {

    public static void main(String[] args) {
        //
//        PlayerMarking[] playerMarkings = {
//                PlayerMarking.X, PlayerMarking.O, PlayerMarking.X,
//                PlayerMarking.X, PlayerMarking.O, PlayerMarking.X,
//                PlayerMarking.O, PlayerMarking.X, PlayerMarking.O
//        };
//
//        gameBoard.setGameBoard(playerMarkings);


        Player player1 = new Human(PLAYER_1, "Dudu");
        Player player2 = new Human(PLAYER_2, "Zé");
        Player player3 = new Bot(PLAYER_2, "Botzera");

        GameCore game = new GameCore(player1, player2, 3);
        game.run();
    }

}
