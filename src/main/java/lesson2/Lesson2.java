package lesson2;

public class Lesson2 {
    public static void main(String[] args) {

        //определение переменных
        int a;
        double a_b;
        int b, c;

        //системы счисления
        int n16 = 0x6F; //16-ричная система, число 111;
        int n8 = 010; //8-ричная система, число 8;
        int n2 = 0b1101; //2-ичная система, число 13;

        float fl = 2.5f;
        double db = 2.5;
        char ch = 'a';
        char charNum = 320;
        System.out.println(charNum);
        String hello = "Hello";
        System.out.println(hello);
        System.out.print(hello);
        System.out.print(hello);

        System.out.println("----------------------------");
        //изменение значения переменной
        int number = 2;
        number = 22;
        number = 23;
        System.out.println(number);

        //создание константы
        final int number2 = 3;
//        number2 = 33; //ошибка

        //Преобразование базовых типов данных
        byte x = 10;
        byte y = x;
        System.out.println(y);

        byte z = 6;
        int y1 = z;
        System.out.println(y1);

        //сужающее преобразование типов
        int z2 = 6;
        byte y2 = (byte) z2;

        double a1 = 23.89;
        int b1 = (int) a1;
        System.out.println(b1);

        int c1 = (int) Math.round(a1);
        System.out.println(c1);

        //преобразование при операциях
        int a2 = 2;
        double b2 = 2.2;
        double c2 = a2 + b2;
        System.out.println(c2);

        byte a3 = 3;
        short b3 = 5;
        byte c3 = (byte) (a3 + b3);

        //арифметические операции
        int a4 = 2 + 3;
        int a5 = 2 - 3;
        int a6 = 2 * 3;
        double a7 = 14.0 / 2;
        System.out.println(a7);
        double a8 = 15.0 % 2;
        System.out.println(a8);

        int a9 = 9;
        int a10 = ++a9;
        System.out.println(a9);
        System.out.println(a10);

        int a11 = 9;
        int a12 = a11++;
        System.out.println(a12);
        System.out.println(a11);

        int a13 = 8;
        int a14 = --a13;
        System.out.println(a13);
        System.out.println(a14);

        int a15 = 8;
        int a16 = a15--;
        System.out.println(a15);
        System.out.println(a16);

        String hello1 = "he" + "llo";
        System.out.println(hello1);

        //логическое умножение(&) = и
        int a17 = 2; //010
        int a18 = 5; //101
        System.out.println(a17&a18); //000

        int a19 = 4; //100
        int a20 = 5; //101
        System.out.println(a19&a20); //100

        //логическое сложение(|) = или
        int b4 = 2; //010
        int b5 = 5; //101
        System.out.println(b4|b5); //111 = 7

        //логическое исключающее или (^) или
        int b6 = 2; //010
        int b7 = 5; //101
        System.out.println(b6^b7); //111 = 7

        //логическое отрицание (~)
        byte b8 = 2; // 0000 0010
        System.out.println(~b8); //1111 1101

        int a21 = 4; //100
        int b9 = 1;
        System.out.println(a21<<b9);//1000
        int a22 = 16;//10000
        int b10 = 1;
        System.out.println(a22>>b10);//1000

        // == != < > <= >=
        int z10 = 5;
        int y10 = 5;
        boolean c10 = z10==y10;
        boolean c11 = z10!=y10;
        boolean c12 = z10<y10;
        boolean c13 = z10>y10;
        System.out.println(c10);
        System.out.println(c11);
        System.out.println(c12);
        System.out.println(c13);

        boolean c14 = (2 > 3) || (4 < 6);// или
        System.out.println(c14);

        boolean c15 = (2 > 3) && (4 < 6);//и
        System.out.println(c15);

        int k = 1;
        k+=5;
        System.out.println(k);
        k-=1;
        System.out.println(k);
        k*=10;
        System.out.println(k);
        k/=2;
        System.out.println(k);
        k%=2;
        System.out.println(k);

        int x1 = 4;
        int y15 = 5;
        int z15 = 100 + 10 * -20 / ++x1 * (y15 - 1);
        System.out.println(z15);

        int random = (int) (Math.random() * 5);
        System.out.println(random);

        //генерация вещественного числа в диапазоне [a;b) формула: (Math.random() * (b-a)) + a
        double f = Math.random() * 200 - 100;//[-100;100)
        System.out.println(f);

        //генерация вещественного числа в диапазоне [a;b] формула: (Math.random() * (b-a+1)) + a
        double f1 = Math.random() * 201 - 100;//[-100;100]
        int f2 = (int) (Math.random() * 201 - 100);//[-100;100]
        System.out.println(f2);

        if (5 > 4 || 3 < 1) {
            System.out.println("Мы здесь");
        } else {
            System.out.println("Мы попали в else");
        }

        String answer = "омтывдмт";

        switch (answer) {
            case "Да":
                System.out.println("Продолжаем программу");
                break;
            case "Нет":
                System.out.println("Останавливаем программу");
                break;
            default:
                System.out.println("Измените значение");
        }
    }
}
