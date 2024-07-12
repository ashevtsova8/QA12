package lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class FindFirstFindAny {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Alice", "Tom", "Sam", "Bob", "Alice"));

        Optional<String> first = names.stream().findFirst();
        System.out.println(first);

        Optional<String> any = names.stream().findAny();
        System.out.println(any);
    }
}
