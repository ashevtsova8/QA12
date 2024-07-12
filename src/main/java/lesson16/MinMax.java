package lesson16;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class MinMax {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));

        Optional<Integer> min = nums.stream().min(Integer::compareTo);
        Optional<Integer> max = nums.stream().max(Integer::compareTo);
        System.out.println(min.get());
        System.out.println(max.get());
    }
}
