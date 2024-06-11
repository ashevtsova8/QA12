package lesson7.interfases;

public class Journal implements Printable {
    private String name;

    public String getName() {
        return name;
    }

    public Journal(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("print");
    }
}
