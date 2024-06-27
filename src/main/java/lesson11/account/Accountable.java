package lesson11.account;

public interface Accountable<T> {
    T getId();
    int getSum();
    void setSum(int sum);
}
