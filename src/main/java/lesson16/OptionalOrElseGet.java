package lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

public class OptionalOrElseGet {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Optional<Integer> min = nums.stream().min(Integer::compare);
        Random random = new Random();
        System.out.println(min.orElseGet(() -> random.nextInt(100)));

    }
}
