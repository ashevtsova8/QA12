package lesson15;

public interface Operatinable2<T> {
    T calculate(T x, T y);

    public static void main(String[] args) {
        Operatinable2<Integer> operatinable1 = (x, y) -> x + y;
        Operatinable2<String> operatinable2 = (x, y) -> x + y;

        System.out.println(operatinable1.calculate(1, 2));
        System.out.println(operatinable2.calculate("1", "2"));
    }
}
