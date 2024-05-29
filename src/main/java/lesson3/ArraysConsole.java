package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysConsole {
    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }
}