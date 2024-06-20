package lesson10;

import java.util.ArrayList;

public class ListApp {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>();
        states.add("Германия");
        states.add("Франция");
        states.add("Великобритания");
        states.add("Испания");

        System.out.println(states.get(1));

        states.set(1, "Италия");

        System.out.println(states.get(1));

        System.out.printf("В списке %d элементов\n", states.size());
        for (String str : states) {
            System.out.println(str);
        }

        if (states.contains("Германия")) {
            System.out.println("Германия есть в списке");
        }

        states.remove("Германия");
        System.out.println(states);

        states.remove(0);
        System.out.println(states);

        Object[] countries = states.toArray();
        for (Object object : countries) {
            System.out.println(object);
        }

    }
}
