package lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("Hello");
//        String text = list.get(0);
//        System.out.println(text);
//        list.add(123);

        for (Object el : list) {
            System.out.println((String) el);
        }

        System.out.println("LIST_1");
        List<String> list1 = new ArrayList<>();
        list1.add("Hello");
        String test = list1.get(0);
        System.out.println(test);

        ArrayList<String> arrayList = new ArrayList<>();//алмазный(diamond) синтаксис

        List<String> list2 = new ArrayList<>();
        list2.add("hello");
        String first = list2.get(0);
        System.out.println(first);

        List<String> list3 = Arrays.asList("Hello", "World");
//        List<Integer> list4 = new ArrayList<>(list3);//ошибка classCastException
//        System.out.println(list4);
    }
}
