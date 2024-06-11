package lesson4;

public class Box2 {
    double width;
    double height;
    double depth;

    public double volume () {
        return width * height * depth;
    }
    //Модификаторы доступа
    //private - доступ только внутри данного класса
    //protected - доступ внутри класса и имеют доступ все потомки
    //public - доступ во всем проекте
    //default - доступ имеют все классы, которые объявлены в том же пакете.
}
