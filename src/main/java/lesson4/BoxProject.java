package lesson4;

public class BoxProject {
    public static void main(String[] args) {
        Box box1 = new Box();//создание объекта класса(конструктор без параметров)
        Box box2 = new Box(10, 20, 15);//создание объекта класса(вызов конструктора с параметрами)

        System.out.println(box1.height);
        System.out.println(box2.height);

        box1.width = 1;
        box1.height = 2;
        box1.depth = 3;

        System.out.println(box1.height);

        double volume2 = box2.height * box2.depth * box2.width;
        System.out.println("Объем коробки 2: " + volume2);

        double volume1 = box1.height * box1.depth * box1.width;
        System.out.println("Объем коробки 1: " + volume1);

        Box box3 = new Box();
        Box box4 = box3;

        box3.height = 1;
        System.out.println(box4.height);//box3 и box4 ссылаются на 1 и тот же объект

    }
}
