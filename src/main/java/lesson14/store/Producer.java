package lesson14.store;

public class Producer extends Thread {
    Store store;// объект магазина
    int product = 5;// количество товаров, которое нужно произвести

    Producer(Store store) {
        this.store = store;
    }
    @Override
    public void run() {
        try {
            while(product > 0) {
                product = product - store.put();
                System.out.println("Производителю осталось произвести " + product + " товар(ов)");
                sleep(100);//время простоя
            }
        } catch (InterruptedException ex) {
            System.out.println("Поток производителя прерван");
        }
    }
}
