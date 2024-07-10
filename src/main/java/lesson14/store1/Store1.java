package lesson14.store1;

public class Store1 {
    private int product = 0;
    private boolean available = false;

    public synchronized void get() {
        while (product < 1) {
            try {
                wait();//ждем
            } catch (InterruptedException ex) {
            }
        }
        product--;
        System.out.println("Покупатель купил 1 товар");
        System.out.println("Товаров на складе: " + product);
        notify();//азрешаем другому потоку  перехватить монитор
    }

    public synchronized void put() {
        while (product >= 3) {
            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }
        product++;
        System.out.println("Производитель выпустил 1 товар");
        System.out.println("Товаров на складе: " + product);
        notify();
    }
}
