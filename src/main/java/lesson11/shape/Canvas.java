package lesson11.shape;

import java.util.List;

public class Canvas {

    public void drawAll(List<? extends Shape> list) {
        for (Shape el : list) {
            el.draw(this);
        }
    }
}
