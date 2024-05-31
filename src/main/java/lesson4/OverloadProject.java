package lesson4;

public class OverloadProject {
    public static void main(String[] args) {
        Overload overload = new Overload();
        overload.test();
        overload.test(1);
        overload.test(1, 2);
        overload.test(1.4);
    }
}
