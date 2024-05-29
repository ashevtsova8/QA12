package lesson3;

import java.util.Arrays;

public class ArraysFill {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        Arrays.fill(array, 5);
        System.out.println(Arrays.toString(array));
    }
}