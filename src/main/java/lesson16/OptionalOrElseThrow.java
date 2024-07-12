package lesson16;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public class OptionalOrElseThrow {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        Optional<Integer> min = nums.stream().min(Integer::compare);
        System.out.println(min.orElseThrow(IllegalStateException::new));
    }
}
