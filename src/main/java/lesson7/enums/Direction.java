package lesson7.enums;

public enum Direction {
    UP, DOWN;

    public Direction opposite(){
        return this == UP ? DOWN : UP;
    }
}
