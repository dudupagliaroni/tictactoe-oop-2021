package com.eduardo.jogo;

import java.util.Random;
import java.util.Scanner;

public class Player {

    private PlayerType playerType;
    private PlayerNumber playerNumber;
    private int points;
    private String name;

    public Player(PlayerType playerType, PlayerNumber playerNumber, String name) {
        this.playerType = playerType;
        this.playerNumber = playerNumber;
        this.name = name;
        this.points = 0;

    }

    public int playerMove(GameBoard board, Player player) {
        switch (player.getPlayerType()) {
            case PLAYER_HUMAN -> {
                System.out.println(player.getPlayerNumber() + " move");
                Scanner scan = new Scanner(System.in);
                return scan.nextInt() - 1;

            }
            case PLAYER_BOT -> {
                System.out.println(player.getPlayerNumber() + " move");
                return board.getAllPositions()[new Random().nextInt(board.getGameboard().length)];
            }
            default -> throw new IllegalStateException("Unexpected value: " + player.playerNumber);

        }

    }

    public PlayerMarking getPlayerMarking() {
        PlayerMarking playerMarking = PlayerMarking.E;
        switch (this.getPlayerNumber()) {
            case PLAYER_1 -> {
                playerMarking = PlayerMarking.X;
            }
            case PLAYER_2 -> {
                playerMarking = PlayerMarking.O;
            }
        }
        return playerMarking;
    }

    public PlayerNumber getPlayerNumber() {
        return playerNumber;
    }

    public PlayerType getPlayerType() {
        return playerType;
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



