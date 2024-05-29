package lesson3;

public class For {

    public static void main(String[] args) {
        //for
        int a, b = 4;

        for (int n = 10; n > 0; n--) {
            System.out.println("Hello " + n);
        }

        System.out.println("-------------------------");

        for (int n = 1; n <= 5; n++) {
            System.out.println("Hello " + n);
        }

        System.out.println("-------------------------");

        for (a = 1; a < b; a++) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            b--;
        }

        for (a = 1, b = 4; a < b; a++) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            b--;
        }

        System.out.println("---------------------------");
        int i = 0;
        boolean done = false;

        for (; !done; ) {
            System.out.println("i is " + i);
            if (i == 10) {
                done = true;
            }
            i++;
        }

        System.out.println("---------------------------");
//        int i1 = 1;
//        for (;;) {
//            System.out.println(i1 * i1);
//        }
        System.out.println("---------------------------");
        for (int l = 0; b < 10; l++) {
            for (int j = l; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("__________________________________");
        //цикл foreach вывод массива
        int[] array = new int[]{1, 2, 3, 4, 5};
        for (int i1 : array) {
            System.out.println(i1);
        }
        System.out.println("__________________________________");
        //цикл for вывод массива
        for (int k = 0; i < array.length; k++) {
            array[k] = array[k] * 2;
            System.out.println(array[k]);
        }
    }
}