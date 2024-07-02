package lesson13;

import java.io.*;

public class Person implements Serializable {
    private transient String name;
    private int age;
    private double height;
    private  boolean married;

    public Person(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public static void main(String[] args) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            Person p = new Person("Tom", 34, 180, true);
            objectOutputStream.writeObject(p);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Person p = (Person) objectInputStream.readObject();
            System.out.printf("Name: %s Age:%d Height: %.2f Married: %b",
                p.getName(), p.getAge(), p.getHeight(), p.isMarried());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
