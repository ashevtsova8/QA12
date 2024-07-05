package lesson15;

public class ProducerConsumer1Main {
    public static void main(String[] args) {
        Store1 store1 = new Store1();
        Producer1 producer1 = new Producer1(store1);
        Consumer1 consumer1 = new Consumer1(store1);
        new Thread(producer1).start();
        new Thread(consumer1).start();
    }
}
