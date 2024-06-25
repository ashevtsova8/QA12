package lesson10;

import java.util.TreeSet;

public class PersonProject2 {
    public static void main(String[] args) {
        PersonComparator personComparator = new PersonComparator();
        TreeSet<Person> people = new TreeSet<>(personComparator);
        people.add(new Person("Tom"));
        people.add(new Person("Shon"));
        people.add(new Person("Dan"));

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
