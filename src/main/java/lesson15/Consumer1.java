package lesson15;

//класс Потребитель
public class Consumer1 implements Runnable {
    Store1 store1;
    public Consumer1(Store1 store1) {
        this.store1 = store1;
    }
    public void run() {
        for (int i = 1; i < 6; i++) {
            store1.get();
        }
    }
}
