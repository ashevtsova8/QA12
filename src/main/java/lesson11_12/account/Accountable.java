package lesson11_12.account;

public interface Accountable<T> {
    T getId();
    int getSum();
    void setSum(int sum);
}
