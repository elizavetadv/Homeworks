package by.overone.game;

public class Win {

    public static boolean checkWin() {
        boolean flag = false;

        if (gameBox.box.get("1 1").equals(gameBox.box.get("1 2")) && gameBox.box.get("1 2").equals(gameBox.box.get("1 3")) && !gameBox.box.get("1 1").equals(" ")) {
            flag = true;
        }

        if (gameBox.box.get("2 1").equals(gameBox.box.get("2 2")) && gameBox.box.get("2 2").equals(gameBox.box.get("2 3")) && !gameBox.box.get("2 1").equals(" ")) {
            flag = true;
        }

        if (gameBox.box.get("3 1").equals(gameBox.box.get("3 2")) && gameBox.box.get("3 2").equals(gameBox.box.get("3 3")) && !gameBox.box.get("3 1").equals(" ")) {
            flag = true;
        }

        if (gameBox.box.get("1 1").equals(gameBox.box.get("2 1")) && gameBox.box.get("2 1").equals(gameBox.box.get("3 1")) && !gameBox.box.get("1 1").equals(" ")) {
            flag = true;
        }

        if (gameBox.box.get("1 2").equals(gameBox.box.get("2 2")) && gameBox.box.get("2 2").equals(gameBox.box.get("3 2")) && !gameBox.box.get("1 2").equals(" ")) {
            flag = true;
        }

        if (gameBox.box.get("1 3").equals(gameBox.box.get("2 3")) && gameBox.box.get("2 3").equals(gameBox.box.get("3 3")) && !gameBox.box.get("1 3").equals(" ")) {
            flag = true;
        }

        if (gameBox.box.get("1 1").equals(gameBox.box.get("2 2")) && gameBox.box.get("2 2").equals(gameBox.box.get("3 3")) && !gameBox.box.get("1 1").equals(" ")) {
            flag = true;
        }

        if (gameBox.box.get("3 1").equals(gameBox.box.get("2 2")) && gameBox.box.get("2 2").equals(gameBox.box.get("1 3")) && !gameBox.box.get("3 1").equals(" ")) {
            flag = true;
        }

        return flag;
    }
}
