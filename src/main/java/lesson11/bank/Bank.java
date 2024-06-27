package lesson11.bank;

import java.util.Arrays;

public class Bank<T> {
    T[] accounts;

    public Bank() {
    }

    public Bank(T[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
