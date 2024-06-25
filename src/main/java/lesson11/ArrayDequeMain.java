package lesson11;

import java.util.ArrayDeque;

public class ArrayDequeMain {
    public static void main(String[] args) {
        ArrayDeque<Person> people = new ArrayDeque<>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));

        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}
