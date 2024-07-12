package lesson16;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceString {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Hello", "from", "me");
        Optional<String> sentence = stringStream.reduce((x, y) -> x + " " + y);
        String res = sentence.get();
        System.out.println(res);
    }
}
