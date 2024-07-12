package lesson16;

import java.util.stream.Stream;

public class PhoneFlatMap {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(
                new Phone("phone1", 5000),
                new Phone("phone2", 900),
                new Phone("phone3", 2500)
        );

        //flatMap используется если из 1 элемента нужно получить несколько
        phoneStream
                .flatMap(p -> Stream.of(
                        String.format("название: %s цена без скидки %d", p.getName(), p.getPrice()),
                        String.format("название: %s со скидкой %f", p.getName(), p.getPrice()*0.9)))
                .forEach(System.out::println);
    }
}
