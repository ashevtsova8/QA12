package lesson15.interfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorMain {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(3, 5));
        System.out.println(multiply.apply(3, -5));
    }
}
