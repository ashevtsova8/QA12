package lesson15;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadsApp3 {
    public static void main(String[] args) {
        CommonResource3 commonResource = new CommonResource3();
        ReentrantLock reentrantLock = new ReentrantLock();//создаем заглушку
        for (int i = 1; i < 6; i++) {
            Thread thread = new Thread(new CountThread3(commonResource, reentrantLock));
            thread.setName("Поток " + i);
            thread.start();
        }
    }
}
