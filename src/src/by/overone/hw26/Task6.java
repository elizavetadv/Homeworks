package src.by.overone.hw26;

import java.util.Scanner;
import java.util.function.Supplier;

public class Task6 {
    public static String reverseString() {

        Supplier<String> reverse = () ->{
            Scanner sc = new Scanner(System.in);
            String str1 = sc.nextLine();

            StringBuilder strNew = new StringBuilder(str1);

            return String.valueOf(strNew.reverse());
        };

        return reverse.get();

    }
}
