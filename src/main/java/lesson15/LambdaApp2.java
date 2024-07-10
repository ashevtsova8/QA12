package lesson15;

public class LambdaApp2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        Operatinable1 operatinable = () -> {
//            x = 30;
            return x + y;
        };
        System.out.println(operatinable.calculate());
        System.out.println(x);
    }
}
