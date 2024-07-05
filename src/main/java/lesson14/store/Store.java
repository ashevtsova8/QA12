package lesson14.store;

//магазин
public class Store {
    int counter = 0; // счетчик товаров
    final int N = 5;//максимально допустимое количество товаров

    // для производителя
    synchronized int put() {
        if (counter <= N) {
            counter++; //кладем товар
            System.out.println("Магазин имеет " + counter + " товар(ов)");
            return 1;
        }
        return 0;
    }

    //для покупателей
    synchronized int get() {
        if (counter > 0) {
            counter--; //забираем товар
            System.out.println("Магазин имеет " + counter + " товар(ов)");
            return 1;
        }
        return 0;
    }
}
