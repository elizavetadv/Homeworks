package src;

public class Egg implements Runnable{

    @Override
    public void run() {
        int i = 0;
        while(i < 3) {
            System.out.println("Egg " + i );
            i++;
        }
    }

}
