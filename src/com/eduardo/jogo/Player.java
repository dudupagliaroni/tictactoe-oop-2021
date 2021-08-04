package com.eduardo.jogo;

import java.util.Random;
import java.util.Scanner;

public class Player {

    private PlayerType playerType;
    private int points;
    private String name;
    private int positionThePlayerChose;

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
                Scanner scan = new Scanner(System.in);
                int position = scan.nextInt() - 1;
                return position;

            }
            case PLAYER_BOT -> {
                System.out.println("Bot move");
                int random = new Random().nextInt(board.getGameboard().length);
                int position = board.getAllPositions()[random];
                return position;
            }
            default -> throw new IllegalStateException("Unexpected value: " + player.playerType);

        }

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

    public void updatePoins(int points) {
        this.points += points;
    }

    public int getPositionThePlayerChose() {
        return positionThePlayerChose;
    }

    public void setPositionThePlayerChose(int positionThePlayerChose) {
        this.positionThePlayerChose = positionThePlayerChose;
    }
}



