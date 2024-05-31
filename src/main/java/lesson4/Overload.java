package lesson4;

public class Overload {
    void test() {
        System.out.println("Параметры отсутствуют.");
    }

    //перегружаемый метод с 1 параметром
    void test(int a) {
        System.out.println("a: " + a);
    }

    //перегружаемый метод с 2 параметром
    void test(int a, int b) {
        System.out.println("a: " + a + ", b: " + b);
    }

    //перегружаемый метод с 1 параметром, изменили тип параметра на double
    void test(double a) {
        System.out.println("a: " + a);
    }
}
