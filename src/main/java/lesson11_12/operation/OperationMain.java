package lesson11_12.operation;

public class OperationMain {
    public static void main(String[] args) {
        Operation operation = new Operation(1.2, 1.3);
        Operation operation1 = new Operation(1, 1);
//        Operation operation2 = new Operation("vekjne", 1); ошибка, т.к указан тип String
        System.out.println(operation.getSum());
        System.out.println(operation1.getSum());
    }
}
