package by.overone.hw23;

public class Main {
    public static void main(String[] args) {
        Num<Integer> num = new Num<>();
        Num<Integer> num1 = new Num<>();

        num.setValue(1);
        num1.setValue(2);

        System.out.println(num.sum(num1));

    }
}
