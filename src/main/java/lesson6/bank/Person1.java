package lesson6.bank;

public abstract class Person1 {
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person1(String name) {
        this.name = name;
    }

    public Person1(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract void displayInfo();
}
