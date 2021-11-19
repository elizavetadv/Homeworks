package src.by.overone.hw26;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

import static src.by.overone.hw26.Task1.listStr;
import static src.by.overone.hw26.Task2.listInt;

public class Task3 {
    public static void square() {
        UnaryOperator<Integer> pow2 = element -> element * element;

        for (int i : listInt) {
            System.out.print(pow2.apply(i) + "   ");
        }

    }

    public static void concatStrings(){
        BinaryOperator<String> concat = (s1, s2) -> s1 + s2;

        for(int i = 0; i < listStr.size() - 1; i++){
            System.out.println(concat.apply(listStr.get(i), listStr.get(i + 1)));
        }

    }
}
