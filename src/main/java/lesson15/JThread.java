package lesson15;

public class JThread extends Thread {
    JThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.printf("Поток %s начал работу... \n", Thread.currentThread().getName());
        int counter = 1;
        while (!isInterrupted()) {
            System.out.println("Цикл " + counter++);
        }
        System.out.printf("Поток %s завершил работу... \n", Thread.currentThread().getName());
    }
}
