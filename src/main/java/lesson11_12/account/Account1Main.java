package lesson11_12.account;

public class Account1Main {
    public static void main(String[] args) {
        Account1<String> account1 = new Account1<>("234", 500);
        String account1Id = account1.getId();
        System.out.println(account1Id);

        Account1<Integer> account2 = new Account1<>(234, 500);
        Integer account2Id = account2.getId();
        System.out.println(account2Id);
    }
}
