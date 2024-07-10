package lesson15;

public class LambdaAppLots {
    public static void main(String[] args) {
        Operatinable operatinable1 = (x, y) -> x + y;
        Operatinable operatinable2 = (x, y) -> x * y;
        Operatinable operatinable3 = (x, y) -> x / y;

        System.out.println(operatinable1.calculate(10, 20));
        System.out.println(operatinable2.calculate(20, 5));
        System.out.println(operatinable3.calculate(20, 2));
    }
}
