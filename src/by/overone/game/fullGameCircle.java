package by.overone.game;

import java.util.Scanner;

public class fullGameCircle {

    public static void oneGame(){
        System.out.println("Welcome to the Tic-Tac-Toe game!");

        gameBox.createBox();
        gameBox.printBox();

        Scanner sc = new Scanner(System.in);

        int count = 0;

        while(count <= 5) {

            System.out.print("\nYour turn. Enter 2 numbers of cell, separated by a space: ");

            String ans = sc.nextLine();

            fillCell.addInCell(ans);

            gameBox.printBox();

            if(count == 4){
                break;
            }

            System.out.println("\nComputer's turn");

            fillCell.addInCellComp();

            gameBox.printBox();

            count++;
        }

        System.out.println("\nDo you want to play again? (yes/no)");
        System.out.print("Your answer: ");

        String answer = sc.nextLine();

        if(answer.equals("yes")){

            fullGameCircle.oneGame();
            System.out.println("\n");

        } else{
            System.out.println("\nBye!");
        }

    }
}
