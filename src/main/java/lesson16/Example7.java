package lesson16;

import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Example7 {
    public static void main(String[] args) {
        Stream<String> citiesStream = Stream.of("Париж","Лондон","Мадрид");
        citiesStream.forEach(s -> System.out.println(s));

        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        intStream.forEach(i -> System.out.println(i));

        DoubleStream doubleStream = DoubleStream.of(1.5, 2.5, 3.5, 4.5, 5.5);
        doubleStream.forEach(i -> System.out.println(i));

        LongStream longStream = LongStream.of(100, 200, 300, 400, 500);
        longStream.forEach(i -> System.out.println(i));
    }
}
