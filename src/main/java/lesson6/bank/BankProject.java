package lesson6.bank;

public class BankProject {
    public static void main(String[] args) {
        Object employee = new Employee1("Anna", "Sidorova", "VTB");
        Person1 person1 = new Client1("Tom", "Kin", "VTB");

        ((Employee1)employee).displayInfo();
        person1.displayInfo();

//        String bank1 = person1.getBank();//этот код не скомпилируется, т.к. у класса Person нет
//        метода getBank(), еобходимо преобразование типов
        String bank = ((Client1)person1).getBank();

        Employee1 man = new Manager1("Tom", "BNB");
        man.displayInfo();
//        Manager1 manager1 = new Employee1("Tom", "BNB");
    }
}
