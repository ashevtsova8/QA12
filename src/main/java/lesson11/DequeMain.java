package lesson11;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {
    public static void main(String[] args) {
        Deque<String> states = new ArrayDeque<>();
        states.add("Germany");
        states.addFirst("France");
        states.push("Great Britain");
        states.addLast("Spain");
        states.add("Italy");

        System.out.println(states);

        System.out.println(states.getFirst());
        System.out.println(states.getLast());
        System.out.println(states.size());

        while (states.peek() != null) {
            //извлечение из начала с удалением
            System.out.println(states.pop());
        }

        System.out.println(states.size());
    }
}
