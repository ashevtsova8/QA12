package lesson4;

public class Book {
    //поля класса Book
    public String name;
    public String author;
    public int year;

    //конструктор без параметров
    Book(){
        name = "неизвестная книга";
        author = "неизвестный автор";
        year = 0;
    }

    //инициализатор
    {
        name = "неизвестная книга";
        author = "неизвестный автор";
        year = 0;
    }

    //конструктор с параметрами
    Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void info() {
        System.out.println("Имя этой книги: " + name);
    }
}
