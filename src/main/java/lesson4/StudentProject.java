package lesson4;

import java.util.Random;

public class StudentProject {
    public static void main(String[] args) {
        Student[] students = new Student[14];
        String[] names = {"Анна", "Максим", "Кристина", "Никита", "Артем", "Иван", "Лолита",
                "Егор", "Илья", "Андрей"};

        for (int i = 0; i < students.length; i++) {
            Random random = new Random();
            int randomGrade = random.nextInt(10);
            String name = names[random.nextInt(names.length)];
            students[i] = new Student(name, 1, randomGrade);
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i].grade > 8) {
                students[i].getStudentInfo();
            }
        }
    }
}
