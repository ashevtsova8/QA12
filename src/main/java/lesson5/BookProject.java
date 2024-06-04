package lesson5;

public class BookProject {

    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Толстой", 1863);
        book1.display();
        Book book2 = new Book("Отцы и дети", "Тургенев", 1862);
        book2.display();
    }
}
