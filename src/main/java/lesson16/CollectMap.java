package lesson16;

import java.util.*;
import java.util.stream.Collectors;

public class CollectMap {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        phones.addAll(Arrays.asList(
                new Phone("phone1", 5000),
                new Phone("phone2", 900),
                new Phone("phone3", 2500)
        ));

        Map<String, Integer> phonesMap = phones.stream()
                .collect(Collectors.toMap(
                        n -> n.getName(),
                        p -> p.getPrice()
                ));
        phonesMap.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
