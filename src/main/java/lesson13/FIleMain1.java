package lesson13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FIleMain1 {
    public static void main(String[] args) {
        File file = new File("D://WORK//Stormnet//SomeDir//myNewFile.txt");
        try(FileWriter fileWriter = new FileWriter("myNewFile.txt")) {
            String text = "Hello World!";
            fileWriter.write(text);
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("File has been created");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
