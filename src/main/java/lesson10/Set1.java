package lesson10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        for (Integer el : set) {
            System.out.println(el);
        }

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("C");
        linkedHashSet.add("B");
        linkedHashSet.add("A");
        System.out.println(linkedHashSet);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Германия");
        treeSet.add("Италия");
        treeSet.add("Великобритания");
        System.out.println(treeSet);

    }
}
