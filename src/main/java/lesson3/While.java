package lesson3;

public class While {
    public static void main(String[] args) {
        /*
        while (условие) {
            //тело цикла
        }
         */
        int n = 10;
        int a = 25;
        int b = 20;

        while (n > 0) {
            System.out.println("Hello " + n);
            n--;
        }

        while (a > b) {
            System.out.println("Мы в цикле");
            a--;
        }

        int i = 10;
        int j = 20;
        while (++i < --j) {
            System.out.println(i);
        }
    }
}