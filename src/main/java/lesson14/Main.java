package lesson14;

public class Main {
    public static void main(String[] args) {
        System.out.println("Главный поток стартовал");
        MyThread myThread = new MyThread("MyThread");
        MyThread myThread1 = new MyThread("MyThread1");
        myThread.start();
        myThread1.start();
        try {
            myThread.join();
            myThread1.join();
        } catch (InterruptedException exception) {
            System.out.println();
        }
        System.out.println("Главный поток завершил работу");
    }
}
