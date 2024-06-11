package lesson7.enums;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Season season = Season.SPRING;

        if (season == Season.SPRING){
            season = Season.SUMMER;
        }
        System.out.println(season);
        System.out.println(Season.class.getSuperclass());
        System.out.println(season.name());
        System.out.println(season.toString());
        System.out.println(season.ordinal());
        System.out.println(Arrays.toString(Season.values()));

        Direction direction = Direction.UP;
        System.out.println(direction.opposite());
    }
}
