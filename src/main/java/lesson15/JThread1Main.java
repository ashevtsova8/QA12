package lesson15;

public class JThread1Main {
    public static void main(String[] args) {
        System.out.println("Главный поток начал работу...");
        Thread thread = new Thread(new JThread1());
        thread.start();

        try {
            Thread.sleep(150);
            thread.interrupt();
            Thread.sleep(150);
        } catch (InterruptedException ex) {
            System.out.println("Поток прерван");
        }
        System.out.println("Главный поток завершил работу...");
    }
}
