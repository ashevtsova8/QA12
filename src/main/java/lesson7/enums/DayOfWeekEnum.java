package lesson7.enums;

public enum DayOfWeekEnum {
    MONDAY("Понедельник", 1),
    TUESDAY("Вторник", 2),
    WEDNESDAY("Среда", 3),
    THURSDAY("Четверг", 4),
    FRIDAY("Пятница", 5),
    SATURDAY("Суббота", 6),
    SUNDAY("Воскресенье", 7),;

    String nameRus;
    int number;

    DayOfWeekEnum(String nameRus, int number) {
        this.nameRus = nameRus;
        this.number = number;
    }

    public String getNameRus() {
        return nameRus;
    }

    public int getNumber() {
        return number;
    }

    public int getNumberByName(String name){
        for(DayOfWeekEnum day : values()) {
            if (day.getNameRus().equals(name)) {
                return day.getNumber();
            }
        }
        return 0;
    }
}
