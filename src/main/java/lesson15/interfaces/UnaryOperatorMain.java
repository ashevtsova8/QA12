package lesson15.interfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorMain {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = m -> m * m;
        System.out.println(square.apply(5));
    }
}
