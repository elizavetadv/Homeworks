package by.overone.hw24;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is your zodiac by date of birth?");

        Birthday birthday = new Birthday();

        Utils.enterData(birthday);

        System.out.print("____________________");

        Result result = new Result() {
            @Override
            public void showResult() {
                System.out.println("\nYour zodiac is " + Zodiac.getUserZodiac(birthday.monthBh.getUserMonth()).toLowerCase() + "!");
            }
        };

        result.showResult();

    }
}
