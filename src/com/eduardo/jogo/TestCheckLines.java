package com.eduardo.jogo;

public class TestCheckLines {

    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();

        PlayerMarking[] playerMarkings = {
                PlayerMarking.X, PlayerMarking.O, PlayerMarking.X,
                PlayerMarking.X, PlayerMarking.O, PlayerMarking.X,
                PlayerMarking.O, PlayerMarking.X, PlayerMarking.O
        };

        gameBoard.setGameBoard(playerMarkings);

        PrintUtil printUtil = new PrintUtil();

        printUtil.printMarkingBoard(gameBoard);

        BoardChecker boardChecker = new BoardChecker();

        System.out.println(boardChecker.checkGameBoard(gameBoard));



    }




}
