package lesson6;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
//        cat.name = "";
//        cat.age = -100;
//        cat.weight = 0; этот код работать не будет, т.к. поля private

        Cat barsik = new Cat("Барсик", 5, 3);
        String barsikName = barsik.getName();
        int barsikAge = barsik.getAge();
        int barsikWeight = barsik.getWeight();

        System.out.println("Имя кота: " + barsikName);
        System.out.println("Возраст кота: " + barsikAge);
        System.out.println("Вес кота: " + barsikWeight);

        barsik.setAge(-1);
        System.out.println("Возраст кота: " + barsik.getAge());

    }
}
