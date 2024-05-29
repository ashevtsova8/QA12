package lesson3;

public class DoWhile {
    /*
    do {
        //тело цикла
    } while (условие);
     */
    public static void main(String[] args) {
        int j = -1;
        int n = 10;

        do {
            System.out.println(j);
            j--;
        } while (j > 0);

        System.out.println("______________________________________");
        do {
            System.out.println("number " + n);
            n--;
        } while (n > 0);
    }
}