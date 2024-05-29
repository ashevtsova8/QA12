package lesson3;

import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = a;
        int[] c = {1, 0, 0, 4, 5};
        b[0] = 50;
        for (int el : a) {
            System.out.println(el);
        }

        System.arraycopy(a, 1, c, 1, 2);
        System.out.println(Arrays.toString(c));
    }
}