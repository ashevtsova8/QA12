package lesson14.store1;

public class Customer1 implements Runnable {
    Store1 store1;
    public Customer1(Store1 store1) {
        this.store1 = store1;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            store1.get();
        }
    }
}
