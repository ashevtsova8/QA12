package lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class PhoneSortedUpperCase {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(
                new Phone("phone1", "Apple", 5000),
                new Phone("phone333", "Samsung", 4000),
                new Phone("phone22", "Samsung", 2000),
                new Phone("phone4444", "LG", 4500)
        );

        phoneStream
                .sorted(new PhoneComparator())
                .forEach(phone -> System.out.printf("%s (%s) : %d \n",
                        phone.getName(), phone.getCompany(), phone.getPrice()));

    }
}
