package com.eduardo.jogo;

public class Player {

    private PlayerType playerType;
    private MarkType markType;
    private int points;
    private String name;

    public Player(PlayerType playerType, String name) {
        this.playerType = playerType;
        this.name = name;
        this.markType = setMarkType(playerType);

    }

    public int playerMove(GameBoard board) {
        //TODO
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
            case BOT -> {
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

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public void setMarkType(MarkType markType) {
        this.markType = markType;
    }

    public void updatePoins(int points) {
        this.points += points;
    }

    public void setName(String name) {
        this.name = name;
    }


    }


}
