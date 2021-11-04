package by.overone.game;

public class Win {
    public static void whoWin(String value){
        if(value.equals("X")){
            System.out.println("\nYOU WIN! CONGRATULATIONS!!!");
        }
        else{
            System.out.println("\nYOU LOSE... SORRY...");
        }
    }

    public static boolean checkWin(String player) {
        boolean flag = false;

        if (gameBox.box.get("1 1").equals(player) && gameBox.box.get("1 2").equals(player) && gameBox.box.get("1 3").equals(player)) {
            flag = true;
            whoWin(player);
        }

        if (gameBox.box.get("2 1").equals(player) && gameBox.box.get("2 2").equals(player) && gameBox.box.get("2 3").equals(player)) {
            flag = true;
            whoWin(player);
        }

        if (gameBox.box.get("3 1").equals(player) && gameBox.box.get("3 2").equals(player) && gameBox.box.get("3 3").equals(player)) {
            flag = true;
            whoWin(player);
        }

        if (gameBox.box.get("1 1").equals(player) && gameBox.box.get("2 1").equals(player) && gameBox.box.get("3 1").equals(player)) {
            flag = true;
            whoWin(player);
        }

        if (gameBox.box.get("1 2").equals(player) && gameBox.box.get("2 2").equals(player) && gameBox.box.get("3 2").equals(player)) {
            flag = true;
            whoWin(player);
        }

        if (gameBox.box.get("1 3").equals(player) && gameBox.box.get("2 3").equals(player) && gameBox.box.get("3 3").equals(player)) {
            flag = true;
            whoWin(player);
        }

        if (gameBox.box.get("1 1").equals(player) && gameBox.box.get("2 2").equals(player) && gameBox.box.get("3 3").equals(player)) {
            flag = true;
            whoWin(player);
        }

        if (gameBox.box.get("3 1").equals(player) && gameBox.box.get("2 2").equals(player) && gameBox.box.get("1 3").equals(player)) {
            flag = true;
            whoWin(player);
        }

        return flag;
    }
}
