package lesson5;

public class CarProject {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.km = 100;
        System.out.println("Car1 - " + car1.km);
        Car car2 = new Car();
        car2.km = 200;

        System.out.println("Car1 - " + car1.km);
        System.out.println("Car2 - " + car2.km);
    }
}
