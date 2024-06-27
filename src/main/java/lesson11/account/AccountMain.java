package lesson11.account;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account(234, 500);
        int accountId = (int) account.getId();
        System.out.println(accountId);

        Account account1 = new Account("234", 500);
        int account1Id = (int) account1.getId();
        System.out.println(account1Id);//ошибка classCastException
    }
}
