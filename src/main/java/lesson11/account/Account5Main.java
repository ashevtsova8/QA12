package lesson11.account;

public class Account5Main {
    public static void main(String[] args) {
        Account5 account1 = new Account5(123, 500);
        Account5 account2 = new Account5("345", 500);
        System.out.println(account1.getId());
        System.out.println(account2.getId());
    }
}
