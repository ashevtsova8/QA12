package lesson3;

public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 10) {
                break;
            } // завершаем цикл, если i = 10
            System.out.println("i: " + i);
        }
        System.out.println("Цикл завершен");
        System.out.println("________________________________________");

        for (int i = 0; i < 3; i++) {
            System.out.print("Итерация " + i + ": ");
            for (int j = 0; j < 10; j++) {
                if (j == 4) {
                    break;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Цикл завершен");
    }
}