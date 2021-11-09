package by.overone.hw23;

public class Main {
    public static void main(String[] args) {
        Num<Integer> num = new Num<>();
        Num<Long> num1 = new Num<>();

        num.setValue(10);
        num1.setValue(1000000000000000L);

        //throw an exception "Type class java.lang.Long does not fit in the type class java.lang.Integer"
        //System.out.println("Sum: " + num.sum(num1));

        Num<Double> num2 = new Num<>();

        num2.setValue(1.9);

        System.out.println("Difference: " + num.giveResult(num.difference(num2), num2));

        Num<Integer> num3 = new Num<>();

        num3.setValue(5);

        System.out.println("Composition: " + num.giveResult(num.composition(num3), num3));

        Num<Float> num4 = new Num<>();

        num4.setValue(2.0f);

        System.out.println("Division: " + num.giveResult(num.division(num4), num4));

    }
}
