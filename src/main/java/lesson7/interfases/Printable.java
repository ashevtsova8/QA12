package lesson7.interfases;

public interface Printable {

    void print();

    default void print1() {
        System.out.println("Undefined printable");
    }

    static void read() {
        System.out.println("Read printable");
    }
}
