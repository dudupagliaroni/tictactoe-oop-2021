package com.eduardo.jogo;

public class PrintUtil {

    public void printBoard(GameBoard gameBoard) {
        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (gameBoard.getMarkingBoard()[k]) {
                    case E -> System.out.print(" _ ");
                    case X -> System.out.print(" X ");
                    case O -> System.out.print(" O ");
                }
                k++;
            }
            System.out.println();
            System.out.println("---------");
        }
        System.out.println();
    }

}
