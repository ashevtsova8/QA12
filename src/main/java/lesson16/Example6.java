package lesson16;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Example6 {
    public static void main(String[] args) {
        IntStream intStream = Arrays.stream(new int[]{1, 2, 3, 4, 5});
        intStream.forEach(i -> System.out.println(i));

        DoubleStream doubleStream = Arrays.stream(new double[]{1.5, 2.5, 3.5, 4.5, 5.5});
        doubleStream.forEach(i -> System.out.println(i));

        LongStream longStream = Arrays.stream(new long[]{100, 200, 300, 400, 500});
        longStream.forEach(i -> System.out.println(i));
    }
}
