package lesson14;

public class MyThread2 implements Runnable {
    private boolean isActive;

    public void disable() {
        isActive = false;
    }

    MyThread2(){
        isActive = true;
    }

    @Override
    public void run() {
        System.out.printf("Поток %s начал работу\n", Thread.currentThread().getName());
        int counter = 1;
        while (isActive) {
            System.out.println("Цикл " + counter++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println("Поток прерван");
            }
        }
        System.out.printf("Поток %s завершил работу\n", Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Главный поток стартовал");
        MyThread2 myThread2 = new MyThread2();
        new Thread(myThread2, "MyThread2").start();
        try {
            Thread.sleep(1100);
            myThread2.disable();
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Поток прерван");
        }
        System.out.println("Главный поток завершил работу");
    }
}
