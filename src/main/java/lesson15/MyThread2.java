package lesson15;

public class MyThread2 implements Runnable {
    private boolean isActive;

    void disable(){
        isActive = false;
    }
    MyThread2(){
        isActive = true;
    }
    public void run(){
        System.out.printf("Поток %s начал работу... \n", Thread.currentThread().getName());
        int counter = 1;
        while (isActive) {
            System.out.println("Цикл " + counter++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException exception) {
                System.out.println("Поток прерван");
            }
        }
        System.out.printf("Поток %s завершил работу... \n", Thread.currentThread().getName());
    }
}
