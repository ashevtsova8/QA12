package lesson11_12.account;

public class DepositAccount8 extends Account6<Integer>{
    public DepositAccount8(int id) {
        super(id);
    }

    public static void main(String[] args) {
        DepositAccount8 depositAccount = new DepositAccount8(2);
        System.out.println(depositAccount.getId());
    }


}
