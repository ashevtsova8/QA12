package lesson13;

import java.io.*;

public class PersonDataMain {
    public static void main(String[] args) {
        Person tom = new Person("Tom", 34, 180, false);
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"))) {
            dos.writeUTF(tom.getName());
            dos.writeInt(tom.getAge());
            dos.writeDouble(tom.getHeight());
            dos.writeBoolean(tom.isMarried());
            System.out.println("File has been written");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {
            String name = dis.readUTF();
            int age = dis.readInt();
            double height = dis.readDouble();
            boolean married = dis.readBoolean();
            System.out.printf("Name: %s, Age: %d, Height: %.2f, Married: %b\n",
                    name, age, height, married);
            System.out.println("File has been read");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
