package lesson4;

public class Box3 {
    double width;
    double height;
    double depth;

    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box3() {
        width = 1;
        height = 1;
        depth = 1;
    }

    Box3(double square) {
        width = height = depth = square;
    }

    public double volume () {
        return width * height * depth;
    }
}
