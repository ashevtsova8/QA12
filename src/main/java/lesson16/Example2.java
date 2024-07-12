package lesson16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        long count = LongStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)
                .filter(n -> n > 0).count();
        System.out.println(count);

    }
}
