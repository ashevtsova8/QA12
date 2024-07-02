package lesson11_12.vehicle;

public class Train extends Vehicle implements IMove{
    public Train(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Train " + getName() + " is moving!");
    }
}
