package lesson15;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Главный поток начал работу...");
        new Thread(new MyThread1(), "MyThread").start();
        System.out.println("Главный поток завершил работу...");
    }
}
