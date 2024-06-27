package lesson11.account;

public class Account4Main {
    public static void main(String[] args) {
        Account4<Double, String> account = new Account4<>(123.124, "123.123");
        double id = account.getId();
        String sum = account.getSum();
        System.out.printf("Id: %.2f, Sum: %s\n", id, sum);
    }
}
