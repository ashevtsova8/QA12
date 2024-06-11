package lesson5;

public class Counter {
    public static final double PI = 3.14;
    public static double pi2 = 3.14;
    static int count;

    public static void increment() {
        count++;
        System.out.println("Текущее значение счетчика: " + count);
    }

    public static void main(String[] args) {
        System.out.println(Counter.PI);
        System.out.println(Counter.pi2);

        Counter.increment();
        Counter.increment();
        Counter.increment();
    }
}
