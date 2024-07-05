package lesson15;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Главный поток начал работу...");
        MyThread2 myThread = new MyThread2();
        new Thread(myThread, "MyThread2").start();
        try {
            Thread.sleep(500);
            myThread.disable();
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.out.println("Поток прерван");
        }
        System.out.println("Главный поток завершил работу...");
    }
}
