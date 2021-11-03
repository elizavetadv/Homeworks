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

    public static boolean checkWin() {
        boolean flag = false;

        if (gameBox.box.get("1 1").equals(gameBox.box.get("1 2")) && gameBox.box.get("1 2").equals(gameBox.box.get("1 3")) && !gameBox.box.get("1 1").equals(" ")) {
            flag = true;
            whoWin(gameBox.box.get("1 1"));
        }

        if (gameBox.box.get("2 1").equals(gameBox.box.get("2 2")) && gameBox.box.get("2 2").equals(gameBox.box.get("2 3")) && !gameBox.box.get("2 1").equals(" ")) {
            flag = true;
            whoWin(gameBox.box.get("2 1"));
        }

        if (gameBox.box.get("3 1").equals(gameBox.box.get("3 2")) && gameBox.box.get("3 2").equals(gameBox.box.get("3 3")) && !gameBox.box.get("3 1").equals(" ")) {
            flag = true;
            whoWin(gameBox.box.get("3 1"));
        }

        if (gameBox.box.get("1 1").equals(gameBox.box.get("2 1")) && gameBox.box.get("2 1").equals(gameBox.box.get("3 1")) && !gameBox.box.get("1 1").equals(" ")) {
            flag = true;
            whoWin(gameBox.box.get("1 1"));
        }

        if (gameBox.box.get("1 2").equals(gameBox.box.get("2 2")) && gameBox.box.get("2 2").equals(gameBox.box.get("3 2")) && !gameBox.box.get("1 2").equals(" ")) {
            flag = true;
            whoWin(gameBox.box.get("1 2"));
        }

        if (gameBox.box.get("1 3").equals(gameBox.box.get("2 3")) && gameBox.box.get("2 3").equals(gameBox.box.get("3 3")) && !gameBox.box.get("1 3").equals(" ")) {
            flag = true;
            whoWin(gameBox.box.get("1 3"));
        }

        if (gameBox.box.get("1 1").equals(gameBox.box.get("2 2")) && gameBox.box.get("2 2").equals(gameBox.box.get("3 3")) && !gameBox.box.get("1 1").equals(" ")) {
            flag = true;
            whoWin(gameBox.box.get("1 1"));
        }

        if (gameBox.box.get("3 1").equals(gameBox.box.get("2 2")) && gameBox.box.get("2 2").equals(gameBox.box.get("1 3")) && !gameBox.box.get("3 1").equals(" ")) {
            flag = true;
            whoWin(gameBox.box.get("3 1"));
        }

        return flag;
    }
}
