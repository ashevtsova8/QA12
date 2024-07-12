package lesson16;

import java.util.ArrayList;
import java.util.Collections;

public class Example3 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Париж","Лондон","Мадрид");
        cities.stream()//получаем поток
                .filter(s -> s.length() == 6)
                .forEach(s -> System.out.println(s));
    }
}
