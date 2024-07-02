package lesson13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterMain {
    public static void main(String[] args) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("notes7.txt"))) {
            String text = "Hello\nHey!";
            bufferedWriter.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
