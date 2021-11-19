package src.by.overone.hw26;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1\n\n" + "Strings started with XX: ");
        Task1.stringsWithXX();

        System.out.println("\nTask 2\n\n" + "Positive numbers from array: ");
        Task2.getPositiveNumbers();

        System.out.println("\nTask 3\n\n" + "Square of numbers from array: ");
        Task3.square();
        System.out.println("\n\nAdding two adjacent strings from array: ");
        Task3.concatStrings();

        System.out.println("\nTask 4 + Task 5\n");
        System.out.print("Enter the amount and currency (BYN, RUB, EUR) separated by space: ");

        Consumer<Double> consumer = x -> System.out.println("Summa in dollars is " + x);
        consumer.accept(Task4.getSumInDollars());

        System.out.println("\nTask 6");
        System.out.print("Enter string to reverse: ");
        System.out.print("Reversed string: " + Task6.reverseString());

        System.out.println("\n\nTask 7\n");
        Task7.stringsWithAA();

        System.out.println("\nTask 8\n");
        Task8.findObjects();

        System.out.println("\nTask 9\n");
        Task9.getNames();

    }

}
