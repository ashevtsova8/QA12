package lesson3;

public class Lesson3 {

    public static void main(String[] args) {

        //объявление массива
        double array1[];
        int[] array2;

        int[] intArray1 = new int[100];
        int[] intArray2 = {0, 1, 2};

        String[] catNames = new String[10]; //default null
        int[] cats = new int[10]; //default 0

        int[] array = new int[]{1, 2, 10, 4, 5};
        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //40 байт

        int[] ints = {0, 1, 3};
        ints[1] = -1;
        ints[1]--;
        ints[1]++;
        ints[5]++; //java.lang,ArrayIndexOutOfBoundsException
        }
}