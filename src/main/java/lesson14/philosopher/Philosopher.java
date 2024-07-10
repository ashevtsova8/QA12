package lesson14.philosopher;

import java.util.concurrent.Semaphore;

//только 2 философа одновременно могут сидеть за столом
public class Philosopher extends Thread {
    Semaphore semaphore;
    //количество приемов пищи
    int eatingNum = 0;
    //номер философа
    int id;
    Philosopher(Semaphore semaphore, int id){
       this.semaphore = semaphore;
       this.id = id;
    }

    public void run() {
        try {
            while (eatingNum < 3) { // пока количество приемов пищи не будет = 3
                //запрашиваем у семафора  разрешение на выполнение кода
                semaphore.acquire();
                System.out.println("Философ " + id + " садится за стол");
                Thread.sleep(500);
                eatingNum++;
                System.out.println("Философ " + id + " выходит из-за стола");
                semaphore.release();
                Thread.sleep(500);
            }
        } catch (InterruptedException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        for (int i = 1; i < 6; i++) {
            new Philosopher(semaphore, i).start();
        }
    }
}
