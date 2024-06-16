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

        DayOfWeekEnum dayOfWeekEnum = DayOfWeekEnum.SATURDAY;
        System.out.println(dayOfWeekEnum.getNameRus());
        System.out.println(dayOfWeekEnum.getNumber());
        int number = DayOfWeekEnum.MONDAY.getNumberByName("Понедельник");
        System.out.println(number);

        Type type = Type.INTEGER;
        System.out.println(type.parse("1"));
        Integer x = (int) type.parse("1");
        System.out.println(x);

        System.out.println(Type.class);
        System.out.println(Type.INT.getClass());
        System.out.println(Type.INT.getClass().getSuperclass());

        System.out.println(Type.INTEGER.getClass());
        System.out.println(Type.INTEGER.getClass().getSuperclass());
    }
}
