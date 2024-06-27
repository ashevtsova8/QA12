package lesson11.vehicle;

public class Garage<T extends Vehicle & IMove> {
    private T[] members;

    public Garage(T[] members) {
        this.members = members;
    }

    public void info() {
        for (T member : members) {
            member.move();
        }
    }
}
