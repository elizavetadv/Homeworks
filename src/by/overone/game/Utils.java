package by.overone.game;

public class Utils {
    public static boolean checkEnteredData(String str) {

        return str.equals("1 1") || str.equals("1 2") || str.equals("1 3") || str.equals("2 1") || str.equals("2 2")
                || str.equals("2 3") || str.equals("3 1") || str.equals("3 2") || str.equals("3 3");

    }
}
