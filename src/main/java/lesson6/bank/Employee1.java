package lesson6.bank;

public class Employee1 extends Person1 {
    private String bank;

    public String getBank() {
        return bank;
    }

    public Employee1(String name, String surname, String bank) {
        super(name, surname);
        this.bank = bank;
    }

    public Employee1(String name, String bank) {
        super(name);
        this.bank = bank;
    }

    @Override
    public void displayInfo(){
        System.out.println("Имя: " + super.getName() + " Фамилия: " + super.getSurname() +
                " Компания: " + bank);
    }
}
