package src;

public class Store {
    private  int product;

    public synchronized void get() throws InterruptedException {
        while (product < 1){
            wait();
        }

        product--;

        System.out.println("Покупатель купил 1 товар");
        System.out.println("Товаров на складе: " + product);

        notify();
    }

    public synchronized void put() throws InterruptedException {
        while(product >= 3){
            wait();
        }

        product++;

        System.out.println("Производитель добавил 1 товар");
        System.out.println("Товаров на складе: " + product);

        notify();
    }
}
