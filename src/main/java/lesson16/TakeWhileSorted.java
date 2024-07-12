package lesson16;

import java.util.stream.Stream;

public class TakeWhileSorted {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers
                .sorted()
                .takeWhile(n -> n < 0)
                .forEach(System.out::println);
    }
}
