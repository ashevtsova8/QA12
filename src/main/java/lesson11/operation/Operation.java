package lesson11.operation;

public class Operation {
    double x, y;

    public <T extends Number> Operation(T x, T y) {
        this.x = x.doubleValue();
        this.y = y.doubleValue();
    }

    public double getSum() {
        return x + y;
    }
}
