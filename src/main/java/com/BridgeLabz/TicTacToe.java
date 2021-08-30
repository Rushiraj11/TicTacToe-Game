package com.BridgeLabz;
import java.util.Scanner;
public class TicTacToe {
    public static final char[] boardarray = new char[10];
    public static int userInputNum;

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        createBoard();
        PlayerChoice();
        printBoard();
        playerCall();
    }

    public static void createBoard() {
        int count = 0;
        count++;
        int i;
        for (i = 1; i < boardarray.length; i++) {
            boardarray[i] = ' ';
        }
    }

    public static void PlayerChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player choose X or O =");
        char player = scanner.next().charAt(0);
        if (player == 'X' || player == 'x') {
            System.out.println("Player Choose X");
            System.out.println("CPU Choice O");
        } else {
            System.out.println("Player Choose O");
            System.out.println("CPU Choice X ");
        PlayerChoice();
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
       createBoard();
    }



    private static void playerCall() {
        System.out.println("\nEnter a number from board to make the mark:\n");
        userInputNum = sc.nextInt();
        if (userInputNum < 1 || userInputNum > 9) {
            printBoard();
            System.out.println("Input is Invalid");
        }
    }

}


