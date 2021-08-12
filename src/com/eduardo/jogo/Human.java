package com.eduardo.jogo;

import java.util.Scanner;

public class Human extends Player {

    public Human(PlayerMark playerMark, String name) {
        super.playerMark = playerMark;
        super.name = name;
        super.points = 0;
    }

    @Override
    public int move(GameBoard board) {
        System.out.println(playerMark + " move");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt() - 1;
    }

}



