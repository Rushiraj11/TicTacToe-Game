package com.BridgeLabz;
import java.util.Scanner;
public class TicTacToe {
    public static final char[] boardarray = new char[10];
    public static int userInputNum;
    public static char player;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        createBoard();
        PlayerChoice();
        printBoard();
        playerCall();
        userMove();
    }

    public static void createBoard() {
        int i;
        for (i = 1; i < boardarray.length; i++) {
            boardarray[i] = ' ';
            {
               if (boardarray[i] != 'X' && boardarray[i] != 'O') {
                    boardarray[i] = (char) (i + '0');
                }
            }
        }
    }

    public static void PlayerChoice() {
        System.out.println("Player choose X or O =");
        player = sc.next().charAt(0);
        if (player == 'X' || player == 'x') {
            System.out.println("Player Choose X" );
            System.out.println("CPU Choice O");
        }else if (player == 'O' || player == 'o') {
            System.out.println("Player Choose O");
            System.out.println("CPU Choice X ");
        } else
        System.out.println("Invalid Selection");
    }

    public static void printBoard() {
        int count = 0;
        int i;

        for (i = 1; i < boardarray.length; i++) {
            count++;
            boardarray[i] = '-';
            boardarray[userInputNum] = player;
            System.out.print("| " + boardarray[i] + " | ");
            if (i == 3 || i == 6) {
                System.out.println("\n-----------------");
            }
        }
        System.out.println("\n-----------------");
    }

    public static void playerCall() {
        System.out.println("\nEnter a number from board to make the mark:\n");
        userInputNum = sc.nextInt();
        if (userInputNum < 1 || userInputNum > 9) {
            System.out.println("Input is Invalid");
            playerCall();
        }
    }

    public static void userMove() {
        if (boardarray[userInputNum] == 'X' || boardarray[userInputNum] == 'O') {
            printBoard();
           System.out.println("Number which is selected is not free");
        } else if (boardarray[userInputNum] !=' ') {
            System.out.println("Position is Occupied");
        }
        else {
            boardarray[userInputNum] = player;
            System.out.println(player + "  is marked at " + userInputNum);
        } printBoard();

    }
    }



