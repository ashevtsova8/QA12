package lesson8.object;

public class Car1 implements Cloneable {
    private String carName;
    private Driver driver;

    public Car1(String carName, Driver driver) {
        this.carName = carName;
        this.driver = driver;
    }

    //конструктор копирования
    public Car1(Car1 otherCar){
        this(otherCar.getCarName(), otherCar.getDriver());
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car1 clone() throws CloneNotSupportedException {
        Car1 newCar = (Car1) super.clone();
        Driver driver = this.getDriver().clone();
        newCar.setDriver(driver);
        return newCar;
    }

    @Override
    public String toString() {
        return "Car1{" + "carName='" + carName + '\'' + ", driver=" + driver + '}';
    }
}
