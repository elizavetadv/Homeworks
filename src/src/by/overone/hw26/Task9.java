package src.by.overone.hw26;

import java.util.stream.Stream;

public class Task9 {

    public static void getNames() {
        Stream<Tester> testers1 = Stream.of(new Tester(1, "bb"),
                new Tester(2, "aa"),
                new Tester(3, "cc"),
                new Tester(4, "bB"),
                new Tester(5, "bbb"),
                new Tester(6, "bb"));

        testers1.map(t -> t.getName()).forEach(System.out::println);
    }

}
