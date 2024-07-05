package lesson14;

public class MyThread1 implements Runnable {
    MyThread1() {
    }

    @Override
    public void run() {
        System.out.printf("Поток %s начал работу\n", Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.out.println("Поток прерван");
        }
        System.out.printf("Поток %s завершил работу\n", Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Главный поток стартовал");
        new Thread(new MyThread1(), "MyThread1").start();
        System.out.println("Главный поток завершил работу");
    }
}
