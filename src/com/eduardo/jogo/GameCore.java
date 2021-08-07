package com.eduardo.jogo;

public class GameCore {


    public void gameLoop(GameSetUp gameSetUp, GameBoard gameBoard, int numOfRounds) {
        int ties = 0;

        RoundLoop roundLoop = new RoundLoop();


        for (int i = 0; i < numOfRounds; i++) {
            gameSetUp.upDateGameState(GameState.PLAYING);
            gameBoard.initGameBoard();
            gameSetUp.upDateGameState(roundLoop.roundLoop(gameBoard, gameSetUp));

            switch (gameSetUp.getGameState()) {
                case X_WINS -> {
                    gameSetUp.getPlayers()[0].updatePoints(1);
                }
                case O_WINS -> {
                    gameSetUp.getPlayers()[1].updatePoints(1);
                }
                case TIE -> {
                    ties++;
                }
            }
        }

        System.out.println("Jogador 1 " + gameSetUp.getPlayers()[0].getPoints());
        System.out.println("Jogador 2 " + gameSetUp.getPlayers()[1].getPoints());
        System.out.println("Empates " + ties);

    }


}
