package lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Example4 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Париж","Лондон","Мадрид");

        Stream<String> citiesStream = cities.stream();//получаем поток
        citiesStream = citiesStream.filter(s -> s.length() == 6);
        citiesStream.forEach(s -> System.out.println(s));

        //ошибка, т.к. после терминальной операции нельзя выполнять другие операции
//        long number = citiesStream.count();
//        System.out.println(number);
    }
}
