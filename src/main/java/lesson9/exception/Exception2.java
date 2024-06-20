package lesson9.exception;

public class Exception2 {
    static void throwOne() throws IllegalAccessException {
        System.out.println("В теле метода throwOne");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException ex) {
            System.out.println("Перехвачено исключение: " + ex);
        }
    }
}
