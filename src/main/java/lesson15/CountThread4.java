package lesson15;

import java.util.concurrent.Semaphore;

public class CountThread4 implements Runnable {
    CommonResource4 res;
    Semaphore semaphore;
    String name;

    public CountThread4(CommonResource4 res, Semaphore semaphore, String name) {
        this.res = res;
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ожидает разрешение");
            semaphore.acquire();
            res.x = 1;
            for (int i = 1; i < 5; i++){
                System.out.println(this.name + ": " + res.x);
                res.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.printf(e.getMessage());
        }
        System.out.println(name + " освобождает разрешение");
        semaphore.release();
    }
}
