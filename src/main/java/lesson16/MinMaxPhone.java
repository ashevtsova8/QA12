package lesson16;

import java.util.ArrayList;
import java.util.Arrays;

public class MinMaxPhone {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        phones.addAll(Arrays.asList(
                new Phone("phone1", "Apple", 5000),
                new Phone("phone333", "Samsung", 4000),
                new Phone("phone22", "Samsung", 2000),
                new Phone("phone4444", "LG", 4500)
        ));

        Phone min = phones.stream().min(Phone::compare).get();
        Phone max = phones.stream().max(Phone::compare).get();
        System.out.printf("MIN Name: %s Price: %d \n", min.getName(), min.getPrice());
        System.out.printf("MAX Name: %s Price: %d \n", max.getName(), max.getPrice());
    }
}
