package lesson4;

import java.util.Arrays;
import java.util.Random;

public class MultiplyArrays {

    //двумерные массивы
    int[][] array = new int[2][3];
    int[][] array2 = {{0, 1, 2}, {3, 4, 5}};

    public static void main(String[] args) {
        int[][] array3 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}}; //объявили массив

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + array3[i][j] + " ");
            }
            System.out.println();//перенос строки
        }

        //table1 аналогично table + for
        int[][] table1 = new int[10][10];
        int[][] table = new int[10][];
        for (int i = 0; i < 10; i++) {
            table[i] = new int[10]; //создаем 10 массивов типа int
        }

        System.out.println("_______________________________________________________________");

        int[][] array4 = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                array4[i][j] = random.nextInt(10);//заполняем случайными числами
            }
        }
        //вывод массива
        for (int[] element : array4) {
            System.out.println(Arrays.toString(element));
        }

        //вывод двумерного массива
        int[][] array5 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(array5));

    }
}
