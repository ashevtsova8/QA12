package lesson14.store;

public class Consumer extends Thread {
    Store store;// объект магазина
    int product = 0;// текущее количество купленных товаров

    Consumer(Store store) {
        this.store = store;
    }
    @Override
    public void run() {
        try {
            while(product < 5) {
                product = product + store.get();
                System.out.println("Покупатель купил " + product + " товар(ов)");
                sleep(150);//время простоя
            }
        } catch (InterruptedException ex) {
            System.out.println("Поток производителя прерван");
        }
    }
}
