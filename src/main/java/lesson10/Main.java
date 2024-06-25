package lesson10;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> states = new HashMap<>();
        states.put(1, "Германия");
        states.put(2, "Франция");
        states.put(4, "Великобритания");
        states.put(3, "Испания");

        System.out.println(states);

        for (Map.Entry<Integer, String> item : states.entrySet()) {
            System.out.printf("Key: %d, Value: %s", item.getKey(), item.getValue());
            System.out.println();
        }
    }
}
