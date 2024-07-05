package lesson15;

//поток производителя
public class Producer extends Thread {
    Store store;//объект склада, куда кладем товар
    int product = 5;//количество товаров, которое нужно произвести

    Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        try {
            while (product > 0) { //пока у производителя имеются товары
                product = product - store.put();//кладем 1 товар на склад
                System.out.println("Производителю осталось произвести " + product + " товар(ов)");
                sleep(100);//время простоя
            }
        } catch (InterruptedException e) {
            System.out.println("Поток производителя прерван");
        }
    }
}
