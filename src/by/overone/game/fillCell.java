package by.overone.game;

public class fillCell {

    public static boolean checkCell(String key){
        return gameBox.box.get(key).equals(" ");
    }

    public static void addInCell(String key, String ans){
        if(checkCell(key)){
            gameBox.box.replace(key, ans);
        }
        else{
            System.out.println("Cell isn't empty");
        }
    }
}
