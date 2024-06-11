package lesson6;

public class Employee extends Person {

    private String company;

    public Employee(String name, String surname, String company) {
        super(name, surname);
        this.company = company;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Компания: " + this.company);
//        System.out.println("Имя: " + super.getName() + " Фамилия: " + super.getSurname() +
//                " Компания: " + company);//2 вариант вывода
    }
}
