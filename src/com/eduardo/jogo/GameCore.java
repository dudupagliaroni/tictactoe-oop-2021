package com.eduardo.jogo;

public class GameCore {

    private Player player1;
    private Player player2;
    private int numOfRounds;

    public GameCore(Player player1, Player player2, int numOfRounds) {
        this.player1 = player1;
        this.player2 = player2;
        this.numOfRounds = numOfRounds;
    }

    public void run() {
        int ties = 0;

        for (int i = 0; i < numOfRounds; i++) {
            RoundState roundState = new Round().runLoop(player1, player2);

            switch (roundState) {
                case X_WINS -> player1.updatePoints(1);
                case O_WINS -> player2.updatePoints(1);
                case TIE    -> ties++;
            }

            System.out.println(roundState);
            System.out.println("Jogador 1 - " + player1.getName() + ": " + player1.getPoints());
            System.out.println("Jogador 2 - " + player2.getName() + ": " + player2.getPoints());
            System.out.println("Empates:   " + ties);

        }


    }
}
