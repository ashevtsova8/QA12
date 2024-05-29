package lesson3;

import java.util.Arrays;
import java.util.Random;

public class ArraysRandom {
    public static void main(String[] args) {
        int[] array =  new int[10];

        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
    }
}