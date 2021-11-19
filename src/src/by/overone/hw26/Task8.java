package src.by.overone.hw26;

import java.util.stream.Stream;

public class Task8 {

    public static Stream<Tester> testers = Stream.of(new Tester(1, "bb"),
            new Tester(2, "aa"),
            new Tester(3, "cc"),
            new Tester(4, "bB"),
            new Tester(5, "bbb"),
            new Tester(6, "bb"));

    public static void findObjects() {
        testers.filter(t -> t.getName().startsWith("bb") && t.getId() > 3).forEach(t -> System.out.println(t.getId() + "  " + t.getName()));
    }

}
