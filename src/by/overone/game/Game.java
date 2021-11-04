package by.overone.game;

import java.util.Scanner;

public class Game {

    public static void oneGame() {
        System.out.println("Welcome to the Tic-Tac-Toe game!");

        Box.createBox();
        Box.printBox();

        Scanner sc = new Scanner(System.in);

        int count = 0;
        String ans = " ";

        while (count <= 5) {

            System.out.print("\nYour turn. Enter 2 numbers of cell, separated by a space: ");
            ans = sc.nextLine();

            while(!Utils.checkEnteredData(ans)){

                System.out.println("\nInvalid data...");
                System.out.print("Your turn. Enter 2 numbers of cell, separated by a space: ");
                ans = sc.nextLine();

            }

            Cell.addInCell(ans);

            Box.printBox();

            if (Win.checkWin("X") || Win.checkWin("O")) {
                break;
            }

            if (count == 4) {
                System.out.println("\nNO WINNER!");
                break;
            }

            System.out.println("\nComputer's turn");

            if (Cell.stopOrMakeWin("O")) {

                if (Cell.stopOrMakeWin("X")) {

                    Cell.addInCellComp();
                }

            }

            Box.printBox();

            if (Win.checkWin("X") || Win.checkWin("O")) {
                break;
            }

            count++;
        }

        System.out.println("\nDo you want to play again? (yes/no)");
        System.out.print("Your answer: ");

        String answer = sc.nextLine();

        if (answer.equals("yes")) {

            Game.oneGame();
            System.out.println("\n");

        } else {
            System.out.println("\nBye!");
        }

    }
}
