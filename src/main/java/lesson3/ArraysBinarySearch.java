package lesson3;

import java.util.Arrays;

public class ArraysBinarySearch {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        Arrays.sort(intArray);
        int key = 3;
        System.out.println(key + " имеет индекс = " +
                Arrays.binarySearch(intArray, key));
    }
}