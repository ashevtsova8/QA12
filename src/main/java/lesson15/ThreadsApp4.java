package lesson15;

import java.util.concurrent.Semaphore;

public class ThreadsApp4 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        CommonResource4 commonResource = new CommonResource4();
        new Thread(new CountThread4(commonResource, semaphore, "Count Thread 1")).start();
        new Thread(new CountThread4(commonResource, semaphore, "Count Thread 2")).start();
        new Thread(new CountThread4(commonResource, semaphore, "Count Thread 3")).start();
    }
}
