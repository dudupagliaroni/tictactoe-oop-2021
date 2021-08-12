package com.eduardo.teste;

import com.eduardo.jogo.BoardChecker;
import com.eduardo.jogo.GameBoard;
import com.eduardo.jogo.PlayerMarking;
import com.eduardo.jogo.PrintUtil;

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

        printUtil.printBoard(gameBoard);

        BoardChecker boardChecker = new BoardChecker();

        System.out.println(boardChecker.checkGameState(gameBoard));



    }




}
