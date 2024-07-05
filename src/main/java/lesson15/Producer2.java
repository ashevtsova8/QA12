package lesson15;

//класс Производитель
public class Producer2 implements Runnable {
    Store2 store2;//объект склада, куда кладем товар
    Producer2(Store2 store2) {
        this.store2 = store2;
    }
    public void run() {
        for (int i = 1; i < 6; i++) {
            store2.put();
        }
    }
}
