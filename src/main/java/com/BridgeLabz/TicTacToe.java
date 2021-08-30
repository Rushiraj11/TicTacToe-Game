package com.BridgeLabz;

public class TicTacToe {
    public static final char[] boardarray = new char[10];

    public static void main(String[] args) {
   createBoard();
    }

    public static void createBoard() {
        int count = 0;
        int i;
        for (i = 1; i < boardarray.length; i++) {
            boardarray[i] = ' ';

        }
    }
}


