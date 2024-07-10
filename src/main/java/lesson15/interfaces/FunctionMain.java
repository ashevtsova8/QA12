package lesson15.interfaces;

import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
        Function<Integer, String> convert = x -> String.valueOf(x) + " долларов";
        System.out.println(convert.apply(5));
    }
}
