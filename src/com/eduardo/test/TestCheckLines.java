package com.eduardo.jogo.test;

import com.eduardo.jogo.BoardChecker;
import com.eduardo.jogo.GameBoard;
import com.eduardo.jogo.PlayerNumber.PlayerMark;
import com.eduardo.jogo.PrintUtil;

import static com.eduardo.jogo.PlayerNumber.PlayerMark.O;
import static com.eduardo.jogo.PlayerNumber.PlayerMark.X;

public class TestCheckLines {

    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();

        PlayerMark[] playerMarkings = {
                X, O, X,
                X, O, X,
                O, X, O
        };

        gameBoard.setGameBoard(playerMarkings);

        PrintUtil printUtil = new PrintUtil();

        printUtil.printBoard(gameBoard);

        BoardChecker boardChecker = new BoardChecker();

        System.out.println(boardChecker.checkGameState(gameBoard));



    }




}
