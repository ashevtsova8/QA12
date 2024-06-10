package lesson6.bank;

public class Client1 extends Person1 {
    private String bank;

    public Client1(String name, String surname, String bank) {
        super(name, surname);
        this.bank = bank;
    }

    public String getBank() {
        return bank;
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя: " + super.getName() + " Фамилия: " + super.getSurname() +
                " Компания: " + bank);
    }
}
