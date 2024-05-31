package lesson4;

public class Box3Project {
    public static void main(String[] args) {
        Box3 box1 = new Box3(10, 20, 30);
        Box3 box2 = new Box3();
        Box3 box3 = new Box3(7.5);

        System.out.println("V box1: " + box1.volume());
        System.out.println("V box2: " + box2.volume());
        System.out.println("V box3: " + box3.volume());
    }
}
