package com.eduardo.test;

import com.eduardo.jogo.*;

import static com.eduardo.jogo.Player.PlayerMark.*;

public class TestGame {

    public static void main(String[] args) {

        Player player1 = new Human(X, "Dudu");
        Player player2 = new Human(O, "Zé");
        Player player3 = new Bot(X, "Botzera");
        Player player4 = new Bot(O, "Robo");

        GameCore game = new GameCore(player3, player4, 3);
        game.run();
    }

}
