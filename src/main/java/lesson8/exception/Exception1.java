package lesson8.exception;

public class Exception1 {

    public static void main(String[] args) {
        int d, a;

        try {
            d = 0;
            a = 50 / d;
            System.out.println("Это не будет выведено");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка! Деление на ноль вызвало исключение\n" + e);
        }

        System.out.println("Код после оператора catch");
        System.out.println("________________________________________________");

        try {
            int[] m = {1};
            m[10] = 999;
            int b = args.length;
            System.out.println("b = " + b);
            int c = 10 / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка! Деление на ноль вызвало исключение\n" + e);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Ошибка! Индекс за пределами массива\n" + exception);
        }
        System.out.println("Код после оператора catch");

//        try {
//            int a1 = 0;
//            int b1 = 10 / a1;
//        } catch (Exception ex) {
//            System.out.println("Перехват исключения общего класса");
//        } catch (ArithmeticException exception) {
//            System.out.println("Этот код недостижим");
//        }

        try {
            int a1 = 0;
            int b1 = 10 / a1;
        } catch (ArithmeticException ex) {
            System.out.println("Перехват исключения");
        } catch (Exception exception) {
            System.out.println("Общий класс исключений");
        }
    }
}
