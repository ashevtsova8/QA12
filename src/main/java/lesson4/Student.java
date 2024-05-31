package lesson4;

public class Student {
    String name;
    int group;
    int grade;

    Student(String name, int group, int grade){
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public void getStudentInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Group: " + this.group);
        System.out.println("Grade: " + this.grade);
    }
}
