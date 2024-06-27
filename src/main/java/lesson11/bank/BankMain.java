package lesson11.bank;

public class BankMain {
    public static void main(String[] args) {
        Bank<Integer> bank1 = new Bank<>(new Integer[]{1, 2, 3, 4, 5, 6});
        Bank<String> bank2 = new Bank<>(new String[]{"1234", "12345"});
        System.out.println(bank1);
        System.out.println(bank2);
    }
}
