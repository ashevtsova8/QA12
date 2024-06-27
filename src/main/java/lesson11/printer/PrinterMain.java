package lesson11.printer;

public class PrinterMain {
    public static void main(String[] args) {
        Printer printer = new Printer();
        String[] strings = {"Tom", "Nick"};
        Integer[] ints = {123, 345};
        printer.<String>print(strings);
        printer.<Integer>print(ints);
    }
}
