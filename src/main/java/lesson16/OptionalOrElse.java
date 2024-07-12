package lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalOrElse {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Optional<Integer> min = nums.stream().min(Integer::compare);
        System.out.println(min.orElse(-1));

        nums.addAll(Arrays.asList(new Integer[]{4, 5, 6, 7, 8, 9}));
        min = nums.stream().min(Integer::compare);
        System.out.println(min.orElse(-1));
    }
}
