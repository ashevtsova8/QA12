package lesson3;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSort {
    public static void main(String[] args) {
        int[] array = {3, -5, 6, 7, 15, 1};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("____________________");

        Integer[] ar = {3, -5, 6, 7, 15, 1};
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar, Collections.reverseOrder());
        System.out.println(Arrays.toString(ar));

        //сортировка пузырьком
        int[] array1 = {5, 8, 3, 7, 0};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length - 1; j++) {
                if (array1[j] > array1[j + 1]) {
                    int temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}