package lesson10;

import java.util.Comparator;
import java.util.TreeSet;

public class PersonProject3 {
    public static void main(String[] args) {
        Comparator<Person> personComparator = new PersonNameComparator()
                .thenComparing(new PersonAgeComparator());

        TreeSet<Person> people = new TreeSet<>(personComparator);
        people.add(new Person("Tom", 23));
        people.add(new Person("Nick", 20));
        people.add(new Person("Tom", 22));
        people.add(new Person("Bill", 26));

        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
