package by.overone.hw24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is your zodiac by date of birth?");

        Birthday birthday = new Birthday();

        Utils.enterData(birthday);

        System.out.println(Zodiac.getUserZodiac(birthday.monthBh.getUserMonth()));
    }
}
