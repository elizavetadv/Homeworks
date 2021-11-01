package by.overone.game;

import java.util.HashMap;
import java.util.Map;

public class gameBox {
    static Map<String, String> box = new HashMap<>();

    public static void createBox(){
        box.put("1 1", " ");
        box.put("1 2", " ");
        box.put("1 3", " ");
        box.put("2 1", " ");
        box.put("2 2", " ");
        box.put("2 3", " ");
        box.put("3 1", " ");
        box.put("3 2", " ");
        box.put("3 3", " ");
    }

    public static void printBox() {

        System.out.println(" --- --- ---");
        System.out.println("| " + box.get("1 1") + " | " + box.get("1 2") + " | " + box.get("1 3") + " |");
        System.out.println(" --- --- ---");
        System.out.println("| " + box.get("2 1") + " | " + box.get("2 2") + " | " + box.get("2 3") + " |");
        System.out.println(" --- --- ---");
        System.out.println("| " + box.get("3 1") + " | " + box.get("3 2") + " | " + box.get("3 3") + " |");
        System.out.println(" --- --- ---");

    }

}
