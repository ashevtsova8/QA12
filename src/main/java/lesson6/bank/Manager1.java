package lesson6.bank;

public class Manager1 extends Employee1 {

    public Manager1(String name, String bank){
        super(name, bank);
    }

    public void displayInfo(){
        System.out.println("Имя: " + super.getName() + ", " + "Банк: " + super.getBank());
    }
}
