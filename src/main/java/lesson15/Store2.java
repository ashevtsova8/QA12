package lesson15;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

//класс магазин, хранящий произведенные товары
public class Store2 {
    private int product = 0;
    ReentrantLock locker;
    Condition condition;

    public Store2() {
        locker = new ReentrantLock();//создаем блокировку
        condition = locker.newCondition(); //получаем условие, связанное с блокировкой
    }

    public void get() {
        try {
            locker.lock();
            while (product < 1) { //пока нет доступных товаров на складе, ожидаем
                condition.await();
            }
            product--;
            System.out.println("Покупатель купил 1 товар");
            System.out.println("Товаров на складе: " + product);
            //сигнализируем
            condition.signalAll();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            locker.unlock();
        }
    }

    public void put() {
        try {
            locker.lock();
            while (product >= 3) { //пока на складе 3 товара, ждем освобождения места
                condition.await();
            }
            product++;
            System.out.println("Производитель добавил 1 товар");
            System.out.println("Товаров на складе: " + product);
            //сигнализируем
            condition.signalAll();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            locker.unlock();
        }
    }
}
