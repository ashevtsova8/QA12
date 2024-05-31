package lesson4;

public class Console {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.print("Hello world!");
        System.out.print("Hello world!");
        System.out.println();

        int x = 1;
        int y = 2;
        System.out.printf("x=%d; y=%d \n", x, y);
        //%f вещественные числа
        //%s строковые значения
        //%с символьные значения(одиночные)

        String name = "Алена";
        int age =  18;
        float height = 1.7f;
        System.out.printf("Имя:%s, \nВозраст:%d, \nРост:%.3f метров", name, age, height);
    }

}

