package by.overone.hw24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.print("Enter day and month of your birth (ex: 20 august): ");
        System.out.print("Enter day of your birth: ");

        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

        System.out.print("Enter month of your birth: ");

        String ans = sc.next();

        Birthday birthday = new Birthday();
        birthday.setUserDay(day);

        birthday.monthBh.setUserMonth(ans);

        System.out.println(birthday.monthBh.getUserMonth());

    }
}
