package lesson14;

public class JThread extends Thread {
    JThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.printf("Поток %s начал работу\n", Thread.currentThread().getName());
        int counter = 1;
        while (!isInterrupted()) {
            System.out.println("Цикл " + counter++);
        }
        System.out.printf("Поток %s завершил работу\n", Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Главный поток стартовал");
        JThread jThread = new JThread("JThread");
        jThread.start();
        try {
            Thread.sleep(25);
            jThread.interrupt();
            Thread.sleep(25);
        } catch (InterruptedException ex) {
            System.out.println("Поток прерван");
        }
        System.out.println("Главный поток завершил работу");
    }
}
