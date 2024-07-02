package lesson11_12.vehicle;

public class VehicleMain {
    public static void main(String[] args) {
        Car[] cars = new Car[]{new Car("BMW"), new Car("Zeekr")};
        Train[] trains = new Train[]{new Train("Минск-Гомель"), new Train("Гомель-Минск")};

        Garage<Car> carGarage = new Garage<>(cars);
        carGarage.info();

        Garage<Train> trainGarage = new Garage<>(trains);
        trainGarage.info();
    }
}
