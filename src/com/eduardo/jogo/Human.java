package com.eduardo.jogo;

import java.util.Scanner;

public class Human extends Player {

    public Human(PlayerNumber playerNumber, String name) {
        super.playerNumber = playerNumber;
        super.name = name;
        super.points = 0;
    }

    @Override
    public int move(GameBoard board) {
        System.out.println(playerNumber + " move");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt() - 1;
    }

}



