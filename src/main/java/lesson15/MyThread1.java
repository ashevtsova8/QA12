package lesson15;

public class MyThread1 implements Runnable {
    MyThread1(){
    }
    public void run(){
        System.out.printf("Поток %s начал работу... \n", Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Поток прерван");
        }
        System.out.printf("Поток %s завершил работу... \n", Thread.currentThread().getName());
    }
}
