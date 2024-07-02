package lesson13;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("notes6.txt")) {
            String text = "Hello it's me";
            fileWriter.write(text);
            fileWriter.append("\n");
            fileWriter.append("A");

            fileWriter.flush();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
