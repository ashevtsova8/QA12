package lesson15;

public class Main {
    public static void main(String[] args) {
        System.out.println("Главный поток начал работу...");
        MyThread myThread = new MyThread("MyThread");
        myThread.start();
        try {
            myThread.join();
        } catch (InterruptedException ex) {
            System.out.printf("Поток %s прерван", myThread.getName());
        }
        System.out.println("Главный поток завершил работу...");

    }
}
