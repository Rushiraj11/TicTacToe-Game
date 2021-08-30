package com.BridgeLabz;
import java.util.Scanner;
public class TicTacToe {
    public static final char[] boardarray = new char[10];

    public static void main(String[] args) {
        createBoard();
        PlayerOption();
        printBoard();
    }

    public static void createBoard() {
        int count = 0;
        int i;
        for (i = 1; i < boardarray.length; i++) {
            boardarray[i] = ' ';

        }
    }

    public static void PlayerOption() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player One: Choose X or O =");
        char playerChoose = sc.next().charAt(0);
        System.out.println(playerChoose);
        if (playerChoose == 'X') {
            System.out.println("Player Selected X");
        } else {
            System.out.println("CPU Selected O");
        }
    }

    public static void printBoard() {
        int count = 0;
        int i;
        for (i = 1; i < boardarray.length; i++) {
            count++;
            boardarray[i] = ' ';
            System.out.print("| " + boardarray[i] + " | ");
            if (i == 3 || i == 6) {
                System.out.println("\n-----------------");
            }

        }
        System.out.println("\n-----------------");
    }
}


