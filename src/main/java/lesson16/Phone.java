package lesson16;

public class Phone {
    private String name;
    private String company;
    private int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public Phone(String name, String company, int price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public static int compare(Phone phone1, Phone phone2) {
        if(phone1.getPrice() > phone2.getPrice()) {
            return 1;
        } else {
            return -1;
        }
    }
}
