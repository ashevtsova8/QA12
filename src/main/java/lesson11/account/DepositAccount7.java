package lesson11.account;

public class DepositAccount7<T, S> extends Account6<T>{
    private S sum;

    public S getSum() {
        return sum;
    }

    public DepositAccount7(T id) {
        super(id);
    }

    public DepositAccount7(T id, S sum) {
        super(id);
        this.sum = sum;
    }

    public static void main(String[] args) {
        DepositAccount7<Integer, String> depositAccount =  new DepositAccount7<>(20, "567");
        System.out.println(depositAccount.getId() + " " + depositAccount.getSum());

        DepositAccount7<String, Integer> depositAccount1 =  new DepositAccount7<>("20", 567);
        System.out.println(depositAccount1.getId() + " " + depositAccount1.getSum());
    }


}
