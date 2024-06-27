package lesson11.account;

public class Account5 {
    private String id;
    private int sum;

    public <T>Account5(T id, int sum) {
        this.id = id.toString();
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }
}
