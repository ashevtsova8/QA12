package lesson9.exception;

public class Exception3 {
    static void demo() {
        try {
            throw new NullPointerException("null pointer");
        } catch (NullPointerException ex) {
            System.out.println("Исключение перехвачено в теле метода demo");
            throw ex; //повторно выбрасываем исключение
        }
    }

    public static void main(String[] args) {
        try {
            demo();
        } catch (NullPointerException exception) {
            System.out.println("Повторный перехват");
        }
    }
}
