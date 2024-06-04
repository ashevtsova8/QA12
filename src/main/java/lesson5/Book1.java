package lesson5;

public class Book1 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book1 (String name) {
        this.name = name;
    }

    private static void read(Book1 book) {
        book.setName("Неизвестная книга");
    }

    private static void read(int x) {
        x = 10;
    }


    private static void read(String title) {
        title = "Неизвестная книга";
    }

    public static void main(String[] args) {
        Book1 book1 = new Book1("Война и мир");
        read(book1);//объекты передаются по ссылке(меняется значение в ячейке памяти)
        System.out.println(book1.getName());

        int n = 5;
        read(n);//под капотом создается копия числа x = n, которую и используем в методе
        System.out.println(n);

        String title = "Война и мир";
        read(title);//String - неизменяемый
        System.out.println(title);
    }
}
