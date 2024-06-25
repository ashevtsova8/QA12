package lesson11;

public class Util {
    public static <T> T getValue(Object object, Class<T> class1) {
        return (T) object;
    }

    public static <T> T getValue(Object object) {
        return (T) object;
    }
}
