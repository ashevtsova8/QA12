package lesson14.store2;

public class Customer2 implements Runnable {
    Store2 store2;
    public Customer2(Store2 store2) {
        this.store2 = store2;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            store2.get();
        }
    }
}
