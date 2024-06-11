package lesson4;

public class Methods {

    //методы, которые возвращают значения называют функциями
    public int factorial() {
        return 1;
    }

    //процедура
    public void hello() {
        System.out.println("Hello");
    }

    int square(int i) {
        return i * i;
    }

    int getSum(int ...numbers){
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    public static void main(String[] args) {
        Methods methods = new Methods();
        System.out.println(methods.square(5));
        //i - параметр
        //5 - аргумент

        int number = methods.getSum();
        System.out.println(number);

        int number1 = methods.getSum(10, 20);
        System.out.println(number1);

        int number2 = methods.getSum(10, 20, 60, 33, 4);
        System.out.println(number2);
    }
}
