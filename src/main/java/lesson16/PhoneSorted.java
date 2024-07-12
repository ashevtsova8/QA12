package lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PhoneSorted {
    public static void main(String[] args) {
        List<String> phones = new ArrayList<>();
        Collections.addAll(phones, "Phone22", "phone1","phone333", "phone55555", "phone4444");
        phones.stream()
                .filter(phone -> phone.length() < 8)
                .sorted()
                .forEach(System.out::println);

    }
}
