package lesson16;

import java.util.stream.Stream;

public class Distinct {
    public static void main(String[] args) {
        Stream<String> people = Stream.of("Tom", "Bob", "Sam", "Alice", "Kate", "Sam");
        people
                .distinct()
                .forEach(System.out::println);
    }
}
