package lesson15;

import java.util.concurrent.Semaphore;

public class PhilosopherMain {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        for (int i = 1; i < 6; i++) {
            new Philosopher(semaphore, i).start();
        }
    }
}
