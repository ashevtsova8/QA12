package lesson5;

public class BicycleProject {
    public static void main(String[] args) {
        Bicycle aist = new Bicycle("Aist", 120);
        Bicycle.SteetingWheel wheel = aist.new SteetingWheel();
        Bicycle.Seat seat = aist.new Seat();

        seat.up();
        aist.start();
        wheel.left();
        wheel.right();

//        SteetingWheel steetingWheel = new SteetingWheel();//этот код не скомпилируется

        Bicycle bicycle = new Bicycle("Aist", 120, 10);
        Bicycle.Seat seat1 = bicycle.new Seat();
        seat1.getSeatParameter();
    }
}
