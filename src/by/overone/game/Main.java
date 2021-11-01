package by.overone.game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Tic-Tac-Toe game!");
        gameBox.createBox();
        gameBox.printBox();

        System.out.print("\nYour turn. Enter 2 numbers of cell, separated by a space: ");
        Scanner sc = new Scanner(System.in);
        String ans =sc.nextLine();

        fillCell.addInCell(ans);

        gameBox.printBox();

        System.out.println("\nComputer's turn");

        fillCell.addInCellComp();

        gameBox.printBox();
    }
}
