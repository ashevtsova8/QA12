package lesson8.object;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        int age = 18;
        System.out.println("Age is " + age);
        //что делает Java под капотом?
//        String s = String.valueOf(18);
//        String result = "Age is " + s;
//        System.out.println(result);

        Student student = new Student("Ivan");
        System.out.println(student);

//        Student student1 = new Student("Ivan");
//        String result = "Student is " + student1.toString();
//        System.out.println(result);

        Man man = new Man("голубой", 123);
        Man man1 = new Man("голубой", 1234);
        Man man2 = new Man("голубой", 123);
        Woman woman = new Woman("голубой", 123);

        //ошибка, т.к. нельзя выполнить преобразование классов
        System.out.println(man.equals(woman));
        System.out.println(man.equals(man1));//false
        System.out.println(man.equals(man2));//true

        System.out.println("________________________________________________");

        Auto ferrari1 = new Auto("Ferrari 1", 1900, 9006000);
        Auto ferrari2 = new Auto("Ferrari 1", 1900, 90000000);

        System.out.println("Равны ли эти объекты друг другу?");
        System.out.println(ferrari1.equals(ferrari2));

        System.out.println("Какие у них hashcodes?");
        System.out.println(ferrari1.hashCode());
        System.out.println(ferrari2.hashCode());

        System.out.println("________________________________________________");

        Car1 car = new Car1("Грузовик", new Driver("Василий", 40));
        Car1 clonedCar = car.clone();
        System.out.println("1 машина: " + car);
        System.out.println("Клонированная машина: " + clonedCar);

        //меняем имя водителя для склонированной машины
        Driver clonedCarDriver = clonedCar.getDriver();
        clonedCarDriver.setName("Вася");

        System.out.println("1 машина после изменения имени водителя: " + car);
        System.out.println("Клон машина после изменения имени водителя: " + clonedCar);

        System.out.println("________________________________________________");

        Car1 car1 = new Car1("Легковая", new Driver("Петя", 30));
        Car1 car2 = new Car1(car1);

        System.out.println(car1);
        System.out.println(car2);

        car2.setDriver(new Driver("Иван", 25));

        System.out.println(car1);
        System.out.println(car2);
    }
}
