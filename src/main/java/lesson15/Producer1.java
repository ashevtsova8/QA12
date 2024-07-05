package lesson15;

//класс Производитель
public class Producer1 implements Runnable {
    Store1 store1;//объект склада, куда кладем товар
    Producer1(Store1 store1) {
        this.store1 = store1;
    }
    public void run() {
        for (int i = 1; i < 6; i++) {
            store1.put();
        }
    }
}
