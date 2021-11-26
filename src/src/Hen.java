package src;

public class Hen  implements Runnable{

    @Override
    public void run() {
        int i = 0;
        while(i < 3) {
            System.out.println("Hen " + i );
            i++;
        }
    }

}
