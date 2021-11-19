package src.by.overone.hw26;

import java.util.Scanner;
import java.util.function.Function;

public class Task4 {

    public static double getSumInDollars() {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int i = str.indexOf(' ');

        String sum = str.substring(0, i);
        String val = str.substring(i + 1);

        double result = 0;

        Function<String, Double> moneyValue = Double::parseDouble;
        double resSum = moneyValue.apply(sum);

        switch (val) {
            case "BYN":
                result = resSum * 0.41;
                break;
            case "RUB":
                result = resSum * 0.01;
                break;
            case "EUR":
                result = resSum * 1.13;
                break;
            default:
                System.out.println("We don't have this currency...");
        }

        return result;
    }
}
