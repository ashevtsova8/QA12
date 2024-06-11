package lesson7.enums;

public class DayOfWeek {

    private String title;

    public static DayOfWeek MONDAY = new DayOfWeek("Monday");
    public static DayOfWeek TUESDAY = new DayOfWeek("Tuesday");
    public static DayOfWeek WEDNESDAY = new DayOfWeek("Wednesday");

    private DayOfWeek(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "DayOfWeek{title=" + title + "}";
    }

    public static void main(String[] args) {
        DayOfWeek dayOfWeek = new DayOfWeek("Суббота");
        System.out.println(dayOfWeek);
    }
}
