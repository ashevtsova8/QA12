package lesson15;

public interface Operatinable {
    int calculate(int x, int y);

    public static void main(String[] args) {
        Operatinable operatinable = (x, y) -> x + y;
        int result = operatinable.calculate(2, 4);
        System.out.println(result);
    }
}
