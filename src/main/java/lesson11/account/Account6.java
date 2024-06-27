package lesson11.account;

public class Account6<T> {
    private T id;

    public Account6(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }
}
