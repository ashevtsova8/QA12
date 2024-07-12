package lesson16;

import java.util.stream.Stream;

public class PhoneFilter {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(
                new Phone("phone1", 5000),
                new Phone("phone2", 900),
                new Phone("phone3", 2500)
        );

        phoneStream
                .filter(phone -> phone.getPrice() <= 5000)
                .forEach(phone -> System.out.println(phone.getName()));
    }
}
