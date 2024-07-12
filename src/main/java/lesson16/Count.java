package lesson16;

import java.util.ArrayList;
import java.util.Arrays;

public class Count {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Tom", "Sam", "Bob", "Alice"));

        System.out.println(names.stream().filter(m -> m.length() <=3).count());
    }
}
