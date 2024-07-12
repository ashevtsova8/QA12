package lesson16;

import java.util.ArrayList;
import java.util.Arrays;

public class Match {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Tom", "Sam", "Bob", "Alice"));

        //есть ли в потоке строка больше 3
        boolean any = names.stream().anyMatch(s -> s.length() > 3);
        System.out.println(any);

        //все ли строки = 3 символам
        boolean all = names.stream().allMatch(s -> s.length() == 3);
        System.out.println(all);

        //нет ли в потоке имени "Bill"
        boolean none = names.stream().noneMatch(s -> s == "Bill");
        System.out.println(none);
    }
}
