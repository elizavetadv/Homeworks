package src.by.overone.hw26;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Task2 {

    static List<Integer> listInt = Arrays.asList(-5, 1, 3, -8, -10, 5);

    public static void getPositiveNumbers() {

        Predicate<Integer> isPositive = element -> element > 0;

        listInt.stream().filter(isPositive).forEach(System.out::println);

    }
}
