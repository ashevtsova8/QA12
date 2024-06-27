package lesson11.account;

public class Account6Main {
    public static void main(String[] args) {
        DepositAccount6 depositAccount = new DepositAccount6<>(20);
        System.out.println(depositAccount.getId());

        DepositAccount6 depositAccount1 = new DepositAccount6<>("30");
        System.out.println(depositAccount1.getId());

        Account6<Integer> depositAccount2 = new DepositAccount6<>(20);
        System.out.println(depositAccount2.getId());
    }
}
