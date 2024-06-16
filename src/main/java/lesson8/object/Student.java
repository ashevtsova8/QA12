package lesson8.object;

public class Student {
    private String name;

    public Student(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student is " + name;
    }
}

