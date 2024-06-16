package lesson8.object;

public class Car {

    private String model;
    private int speed;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
       return (this == o);
    }


    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Ferrari");
        car1.setSpeed(300);

        Car car2 = new Car();
        car2.setModel("Ferrari");
        car2.setSpeed(300);

        System.out.println(car1.equals(car2));
    }
}
