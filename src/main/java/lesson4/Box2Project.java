package lesson4;

public class Box2Project {
    public static void main(String[] args) {
        Box2 box1 = new Box2();
        Box2 box2 = new Box2();

        //задаем значения переменным экземпляра box1
        box1.width = 10;
        box1.height = 20;
        box1.depth = 15;

        //задаем значения переменным экземпляра box2
        box2.width = 3;
        box2.height = 6;
        box2.depth = 9;

        System.out.println("Объем box1 = " + box1.volume());
        System.out.println("Объем box2 = " + box2.volume());
    }
}
