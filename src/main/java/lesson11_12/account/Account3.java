package lesson11_12.account;

public class Account3<T> implements Accountable<T>{
    private T id;
    private int sum;

    public Account3(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    @Override
    public T getId() {
        return id;
    }

    @Override
    public int getSum() {
        return sum;
    }

    @Override
    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setId(T id) {
        this.id = id;
    }
}
