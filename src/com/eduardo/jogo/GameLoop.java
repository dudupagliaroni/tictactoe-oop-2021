package com.eduardo.jogo;

public class GameLoop {

    GameState gameState = new GameState.PLAYING;
    public int[] gameLoop(Player player, GameBoard board) {


    }

        if (gameState.equals(GameState.PLAYING)) {
            board.upDateGameBoard(player.playerMove(board), board);
            GameState gameState = new CheckGameBoard().checkGameState(board);
            gameLoop(, board);
        }

        return updateScore(board)
    }

    private int[] updateScore(GameBoard gameBoard, Player player1, Player player2, GameState gameState) {

        switch (gameState) {
            case PLAYING:
                gameLoop(nextPlayer(), gameBoard);
                break;
            case X_WINS:
                player1.updatePoins(1);
                break;
            case O_WINS:
                player2.updatePoins(1);
                break;
            case TIE:
                return null;
        }
        return new int[]{player1.getPoints(), player2.getPoints()};
    }

    public Player nextPlayer(Player player){
        switch (player.getMarkType()) {
            case X -> {
                return getPlayer2();
            }
            case O -> {
                return getPlayer1();
            }
            default -> throw new IllegalStateException("Unexpected value: " + player.getMarkType());
        }



    }
