package src.by.overone.hw26;

import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void stringsWithAA() {

        List<String> listStr1 = new ArrayList<>();

        listStr1.add("Aa");
        listStr1.add("aa");
        listStr1.add("aA");
        listStr1.add("aaA");

        listStr1.stream().filter(s -> s.startsWith("aa")).forEach(System.out::println);
    }
}
