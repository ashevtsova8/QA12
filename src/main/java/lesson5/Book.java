package lesson5;

public class Book {
    protected static int counter = 0;
    protected String author;
    protected int year;
    protected String name;

    static {
        counter = 1;
        System.out.println("Вывод статического блока");
    }

    Book(String name, String author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
        counter++;
    }

    public void display() {
        System.out.printf("Counter: %d \n", counter);
    }
}
