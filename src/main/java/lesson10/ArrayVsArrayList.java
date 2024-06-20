package lesson10;

import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        //создание
        String[] strings = new String[10];//array
        ArrayList<String> list = new ArrayList<>();

        //длина
        int n = strings.length;
        int n1 = list.size();

        //взятие элемента
        String s = strings[3];
        String s1 = list.get(3);

        //запись
        strings[3] = "10";
        list.set(3, "5");

        //добавить элемент в конец массива
        list.add("hdsjvvb");

        //вставка на определенную позицию элемента
        list.add(3, "dsvjb");
        list.add(0, "dsvjb");

        //удаление
        strings[2] = null; //останется пустое пространство
        list.remove(3);

    }
}
