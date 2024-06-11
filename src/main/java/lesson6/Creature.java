package lesson6;

public class Creature {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Creature(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Creature(){
    }

    public void eat() {
        System.out.println("om nom nom");
    }

    public void identifyCreature(Creature creature) {
        if (creature instanceof Human) {
            System.out.println("Это человек");
        } else if (creature instanceof Cat) {
            System.out.println("Это кот");
        } else {
            System.out.println("Неизвестное существо");
        }
    }
}
