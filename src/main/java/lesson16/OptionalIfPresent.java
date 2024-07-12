package lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalIfPresent {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(new Integer[]{4, 5, 6, 7, 8, 9}));
        Optional<Integer> min = nums.stream().min(Integer::compare);
        min.ifPresent(System.out::println);
    }
}
