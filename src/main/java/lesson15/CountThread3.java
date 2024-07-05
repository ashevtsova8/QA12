package lesson15;

import java.util.concurrent.locks.ReentrantLock;

public class CountThread3 implements Runnable {
    CommonResource3 res;
    ReentrantLock locker;

    public CountThread3(CommonResource3 res, ReentrantLock locker) {
        this.res = res;
        this.locker = locker;
    }

    @Override
    public void run() {
        try {
            locker.lock();//устанавливаем блокировку
            res.x = 1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s x = %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.printf(e.getMessage());
        } finally {
            locker.unlock();
        }
    }
}
