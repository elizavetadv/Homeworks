package src;

public class Main {
    public static void main(String[] args) {
        Thread hen = new Thread(new Hen(), "It is a hen");
        Thread egg = new Thread(new Egg(), "It is an egg");

        hen.start();
        egg.start();
    }
}
