package lesson11_12.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeMain {
    public static void main(String[] args) {
        List<Circle> list = new ArrayList<>();
        Canvas canvas = new Canvas();
        canvas.drawAll(list);
    }
}
