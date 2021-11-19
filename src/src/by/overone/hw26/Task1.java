package src.by.overone.hw26;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    static List<String> listStr = new ArrayList<>(){};

    static {
        listStr.add("xx");
        listStr.add("Xx");
        listStr.add("XX");
        listStr.add("XXX");
    }

    public static void stringsWithXX() {

        MyInterface myInterface = s -> {
            if(s.startsWith("XX")){
                System.out.println(s);
            }
        };

        for (String s: listStr) {
            output(s, myInterface);
        }

    }

    public static void output(String s, MyInterface myInterface){
        myInterface.getString(s);
    }
}
