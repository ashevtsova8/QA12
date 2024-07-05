package lesson15;

import java.util.concurrent.Semaphore;

//Класс философа
public class Philosopher extends Thread {
    Semaphore semaphore;
    //количество приемов пищи
    int eatingNum = 0;
    //условный номер философа
    int id;

    Philosopher(Semaphore semaphore, int id) {
        this.semaphore = semaphore;
        this.id = id;
    }

    public void run() {
        try {
            while (eatingNum < 3) {//пока количество приемов пищи не достигнет 3
                //Запрашиваем у семафора разрешение на выполнение
                semaphore.acquire();
                System.out.println("Филосов " + id + " садится за стол");
                //филосов ест
                sleep(500);
                eatingNum++;

                System.out.println("Филосов " + id + " выходит из-за стола");
                semaphore.release();

                //филосов гуляет
                sleep(500);
            }
        } catch (InterruptedException exception) {
            System.out.println("У философа " + id + " проблемы со здоровьем");
        }
    }
}
