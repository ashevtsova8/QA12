package lesson15;

public class ProducerConsumer2Main {
    public static void main(String[] args) {
        Store2 store2 = new Store2();
        Producer2 producer2 = new Producer2(store2);
        Consumer2 consumer2 = new Consumer2(store2);
        new Thread(producer2).start();
        new Thread(consumer2).start();
    }
}
