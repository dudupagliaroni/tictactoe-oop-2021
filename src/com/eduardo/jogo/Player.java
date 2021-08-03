package com.eduardo.jogo;

public class Player {

    private PlayerType playerType;
    private MarkType markType;
    private int points;
    private String name;
    private int positionThePlayerChose;

    public Player(PlayerType playerType, String name) {
        this.playerType = playerType;
        this.name = name;
        this.markType = setMarkType(playerType);

    }

    public int playerMove(GameBoard board, Player player) {
        switch (player.playerType) {
            case PLAYER_ONE -> {
                System.out.println("Player 1 move");
            }
            case PLAYER_TWO -> {
                System.out.println("Player 2 move");
            }
            case PLAYER_BOT -> {
                System.out.println("Bot move");
            }
        }
        return 0;
    }

    private MarkType setMarkType(PlayerType playerType) {
        switch (playerType) {

            case PLAYER_ONE -> {
                return markType.X;
            }
            case PLAYER_TWO -> {
                return markType.O;
            }
            case PLAYER_BOT -> {
                return MarkType.O;
            }
            default -> throw new IllegalStateException("Unexpected value: " + playerType);
        }
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public MarkType getMarkType() {
        return markType;
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



