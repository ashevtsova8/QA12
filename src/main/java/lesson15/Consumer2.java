package lesson15;

//класс Потребитель
public class Consumer2 implements Runnable {
    Store2 store2;
    public Consumer2(Store2 store2) {
        this.store2 = store2;
    }
    public void run() {
        for (int i = 1; i < 6; i++) {
            store2.get();
        }
    }
}
