package lesson15;

public class LambdaApp {
    public static void main(String[] args) {
        Operatinable operatinable = new Operatinable() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };

        int result = operatinable.calculate(10, 20);
        System.out.println(result);
    }
}
