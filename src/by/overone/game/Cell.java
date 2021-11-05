package by.overone.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cell {

    public static boolean checkCell(String key) {
        return Box.box.get(key).equals(" ");
    }

    public static void addInCell(String key) {
        String ans = "X";
        if (checkCell(key)) {
            Box.box.replace(key, ans);
        } else {
            System.out.println("Cell isn't empty");
        }
    }

    public static void addInCellComp() {

        String ans = "O";
        Random r = new Random();
        List<String> keys = new ArrayList<>(Box.box.keySet());
        String randomKey = keys.get(r.nextInt(keys.size()));

        if (checkCell(randomKey)) {
            Box.box.replace(randomKey, ans);
        } else {
            addInCellComp();
        }

    }

    public static boolean stopOrMakeWin(String player) {

        if (Box.box.get("1 1").equals(player) && Box.box.get("1 2").equals(player) && Box.box.get("1 3").equals(" ")) {
            Box.box.replace("1 3", "O");
            return false;
        }

        if (Box.box.get("1 1").equals(player) && Box.box.get("1 3").equals(player) && Box.box.get("1 2").equals(" ")) {
            Box.box.replace("1 2", "O");
            return false;
        }

        if (Box.box.get("1 2").equals(player) && Box.box.get("1 3").equals(player) && Box.box.get("1 1").equals(" ")) {
            Box.box.replace("1 1", "O");
            return false;
        }

        if (Box.box.get("2 1").equals(player) && Box.box.get("2 2").equals(player) && Box.box.get("2 3").equals(" ")) {
            Box.box.replace("2 3", "O");
            return false;
        }

        if (Box.box.get("2 1").equals(player) && Box.box.get("2 3").equals(player) && Box.box.get("2 2").equals(" ")) {
            Box.box.replace("2 2", "O");
            return false;
        }

        if (Box.box.get("2 2").equals(player) && Box.box.get("2 3").equals(player) && Box.box.get("2 1").equals(" ")) {
            Box.box.replace("2 1", "O");
            return false;
        }

        if (Box.box.get("3 1").equals(player) && Box.box.get("3 2").equals(player) && Box.box.get("3 3").equals(" ")) {
            Box.box.replace("3 3", "O");
            return false;
        }

        if (Box.box.get("3 1").equals(player) && Box.box.get("3 3").equals(player) && Box.box.get("3 2").equals(" ")) {
            Box.box.replace("3 2", "O");
            return false;
        }

        if (Box.box.get("3 2").equals(player) && Box.box.get("3 3").equals(player) && Box.box.get("3 1").equals(" ")) {
            Box.box.replace("3 1", "O");
            return false;
        }

        if (Box.box.get("1 1").equals(player) && Box.box.get("2 1").equals(player) && Box.box.get("3 1").equals(" ")) {
            Box.box.replace("3 1", "O");
            return false;
        }

        if (Box.box.get("1 1").equals(player) && Box.box.get("3 1").equals(player) && Box.box.get("2 1").equals(" ")) {
            Box.box.replace("2 1", "O");
            return false;
        }

        if (Box.box.get("2 1").equals(player) && Box.box.get("3 1").equals(player) && Box.box.get("1 1").equals(" ")) {
            Box.box.replace("1 1", "O");
            return false;
        }

        if (Box.box.get("1 2").equals(player) && Box.box.get("2 2").equals(player) && Box.box.get("3 2").equals(" ")) {
            Box.box.replace("3 2", "O");
            return false;
        }

        if (Box.box.get("1 2").equals(player) && Box.box.get("3 2").equals(player) && Box.box.get("2 2").equals(" ")) {
            Box.box.replace("2 2", "O");
            return false;
        }

        if (Box.box.get("2 2").equals(player) && Box.box.get("3 2").equals(player) && Box.box.get("1 2").equals(" ")) {
            Box.box.replace("1 2", "O");
            return false;
        }

        if (Box.box.get("1 3").equals(player) && Box.box.get("2 3").equals(player) && Box.box.get("3 3").equals(" ")) {
            Box.box.replace("3 3", "O");
            return false;
        }

        if (Box.box.get("1 3").equals(player) && Box.box.get("3 3").equals(player) && Box.box.get("2 3").equals(" ")) {
            Box.box.replace("2 3", "O");
            return false;
        }

        if (Box.box.get("2 3").equals(player) && Box.box.get("3 3").equals(player) && Box.box.get("1 3").equals(" ")) {
            Box.box.replace("1 3", "O");
            return false;
        }

        if (Box.box.get("1 1").equals(player) && Box.box.get("2 2").equals(player) && Box.box.get("3 3").equals(" ")) {
            Box.box.replace("3 3", "O");
            return false;
        }

        if (Box.box.get("1 1").equals(player) && Box.box.get("3 3").equals(player) && Box.box.get("2 2").equals(" ")) {
            Box.box.replace("2 2", "O");
            return false;
        }

        if (Box.box.get("2 2").equals(player) && Box.box.get("3 3").equals(player) && Box.box.get("1 1").equals(" ")) {
            Box.box.replace("1 1", "O");
            return false;
        }

        if (Box.box.get("3 1").equals(player) && Box.box.get("2 2").equals(player) && Box.box.get("1 3").equals(" ")) {
            Box.box.replace("1 3", "O");
            return false;
        }

        if (Box.box.get("3 1").equals(player) && Box.box.get("1 3").equals(player) && Box.box.get("2 2").equals(" ")) {
            Box.box.replace("2 2", "O");
            return false;
        }

        if (Box.box.get("2 2").equals(player) && Box.box.get("1 3").equals(player) && Box.box.get("3 1").equals(" ")) {
            Box.box.replace("3 1", "O");
            return false;
        }

        return true;
    }

}
