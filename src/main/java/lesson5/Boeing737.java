package lesson5;

public class Boeing737 {

    private int creationYear;
    private static int maxPassengersCount = 300;

    Boeing737(int creationYear) {
        this.creationYear = creationYear;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public static class Drawing {
        public static int getMaxPassengersCount() {
            return maxPassengersCount;
        }
    }
}
