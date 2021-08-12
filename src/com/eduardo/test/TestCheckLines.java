package com.eduardo.test;

import com.eduardo.jogo.BoardChecker;
import com.eduardo.jogo.GameBoard;
import com.eduardo.jogo.Player;
import com.eduardo.jogo.PrintUtil;

import static com.eduardo.jogo.Player.PlayerMark.O;
import static com.eduardo.jogo.Player.PlayerMark.X;

public class TestCheckLines {

    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();

        Player.PlayerMark[] playerMarkings = {
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
