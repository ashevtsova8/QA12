package lesson16;

import java.util.Arrays;
import java.util.stream.Stream;

public class Example5 {
    public static void main(String[] args) {
        Stream<String> citiesStream = Arrays.stream(new String[]{"Париж","Лондон","Мадрид"});
        citiesStream.forEach(s -> System.out.println(s));
    }
}
