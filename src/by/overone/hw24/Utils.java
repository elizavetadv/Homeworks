package by.overone.hw24;

import java.util.Scanner;

public class Utils {

    public static boolean isNumber(String str) {

        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("\nInvalid answer. Please, try again...");
            return false;
        }

    }

    public static void enterData(Birthday birthday) {
        boolean flag1 = true, flag2 = true;
        int day = 0;
        String month = "";

        Scanner sc = new Scanner(System.in);

        while (flag1) {

            while (true) {

                System.out.print("\nEnter day of your birth (example: 20): ");
                String day1 = sc.nextLine();

                if (isNumber(day1)) {
                    day = Integer.parseInt(day1);
                    break;
                }

            }


            if (day > 0 && day <= 31) {
                flag1 = false;
            } else {
                System.out.println("\nIncorrect day. Please, try again...");
                continue;
            }


            while (flag2) {
                System.out.print("\nEnter month of your birth (example: august): ");

                month = sc.next();
                String month1 = month.toUpperCase();

                try {
                    Month.valueOf(month1);
                    flag2 = false;
                } catch (IllegalArgumentException e) {
                    System.out.println("\nIncorrect month. Please, try again...");
                }

            }

            String month1 = month.toUpperCase();
            if (month1.equals("FEBRUARY")) {
                if (day > 29) {
                    System.out.println("\nFebruary contains 28 days. Please, try again...");
                    flag1 = true;
                }
            }

        }

        birthday.setUserDay(day);
        birthday.monthBh.setUserMonth(month);

    }
}
