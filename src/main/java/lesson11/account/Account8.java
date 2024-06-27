package lesson11.account;

public class Account8<T> {
    private T id;

    public Account8(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }
}
