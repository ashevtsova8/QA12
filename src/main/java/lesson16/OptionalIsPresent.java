package lesson16;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalIsPresent {
    public static void main(String[] args) {
        //пустой лист
        ArrayList<Integer> nums = new ArrayList<>();
        Optional<Integer> min = nums.stream().min(Integer::compare);
        if (min.isPresent()) {
            System.out.println(min.get());
        }
    }
}
