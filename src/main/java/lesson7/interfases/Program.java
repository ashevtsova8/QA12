package lesson7.interfases;

public class Program {
    public static void main(String[] args) {
        Calculatable calculatable = new Calculation();
        System.out.println(calculatable.sum(1, 2));
        System.out.println(calculatable.sum(1, 3, 4));

        WaterPipe pipe = new WaterPipe();
        pipe.printState(0);

//        Printer.Printable printable = new Journal("Foreign Affairs");
//        printable.print();

        //1 вариант вызова
//        Book book = new Book("jdvnd", "evken");
//        read(book);

        //2 вариант вызова
        read(new Book("Java", "Author"));
        read(new Journal("Java"));

        Printable printable = createPrintable("Hello", true);
        printable.print();
    }

    static void read(Printable p){
        p.print();
    }

    static Printable createPrintable(String name, boolean option) {
        if (option) {
            return new Book(name, "Author");
        } else {
            return new Journal(name);
        }
    }
}
