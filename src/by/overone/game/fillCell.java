package by.overone.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class fillCell {

    public static boolean checkCell(String key) {
        return gameBox.box.get(key).equals(" ");
    }

    public static void addInCell(String key) {
        String ans = "X";
        if (checkCell(key)) {
            gameBox.box.replace(key, ans);
        } else {
            System.out.println("Cell isn't empty");
        }
    }

    public static void addInCellComp() {
        String ans = "O";
        Random r = new Random();
        List<String> keys = new ArrayList<>(gameBox.box.keySet());
        String randomKey = keys.get(r.nextInt(keys.size()));

        if (checkCell(randomKey)) {
            gameBox.box.replace(randomKey, ans);
        } else{
            addInCellComp();
        }
    }

}
