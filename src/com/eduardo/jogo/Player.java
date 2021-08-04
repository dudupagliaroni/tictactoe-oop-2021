package com.eduardo.jogo;

import java.util.Random;
import java.util.Scanner;

public class Player {

    private PlayerType playerType;
    private int points;
    private String name;



    public Player() {
    }

    public Player(PlayerType playerType, String name) {
        this.playerType = playerType;
        this.name = name;
        this.points = 0;

    }

    public int playerMove(GameBoard board, Player player) {
        switch (player.playerType) {
            case PLAYER_ONE, PLAYER_TWO -> {
                System.out.println(player.getPlayerType() + " move");
                Scanner scan = new Scanner(System.in);
                return scan.nextInt() - 1;

            }
            case PLAYER_BOT -> {
                System.out.println("Bot move");
                return board.getAllPositions()[new Random().nextInt(board.getGameboard().length)];
            }
            default -> throw new IllegalStateException("Unexpected value: " + player.playerType);

        }

    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public PlayerMarking getPlayerMarking() {
        switch (this.getPlayerType()) {
            case PLAYER_ONE -> {
                return PlayerMarking.X;
            }
            case PLAYER_TWO, PLAYER_BOT -> {
                return PlayerMarking.O;
            }
        }
        return null;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public void updatePoints(int points) {
        this.points += points;
    }

}



