package lesson15;

public class JThreadMain {
    public static void main(String[] args) {
        System.out.println("Главный поток начал работу...");
        JThread jThread = new JThread("JThread");
        jThread.start();
        try {
            Thread.sleep(10);
            jThread.interrupt();
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            System.out.println("Поток прерван");
        }
        System.out.println("Главный поток завершил работу...");
    }
}
