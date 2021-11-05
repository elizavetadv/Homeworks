package by.overone.game;

import java.util.Scanner;

public class Utils {

    public static boolean checkEnteredData(String str) {

        return str.equals("1 1") || str.equals("1 2") || str.equals("1 3") || str.equals("2 1") || str.equals("2 2")
                || str.equals("2 3") || str.equals("3 1") || str.equals("3 2") || str.equals("3 3");

    }

    public static String enterCorrectValue(){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nYour turn. Enter 2 numbers of cell, separated by a space: ");
        String ans = sc.nextLine();

        while(!Utils.checkEnteredData(ans)){

            System.out.println("\nInvalid data...");
            System.out.print("Your turn. Enter 2 numbers of cell, separated by a space: ");
            ans = sc.nextLine();

        }

        return ans;
    }

}
