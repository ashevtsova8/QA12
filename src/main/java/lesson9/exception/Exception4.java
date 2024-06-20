package lesson9.exception;

public class Exception4 {
    static String helloWorld() {
        try {
            System.out.println("Trying string");
            return "Trying string";
        } catch (Exception e) {
            return "Catch String";
        } finally {
            return "Finally String";
        }
    }

    public static void main(String[] args) {
        System.out.println(helloWorld());
    }
}
