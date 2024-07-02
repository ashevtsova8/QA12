package lesson13;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMain {
    public static void main(String[] args) {
        String text = "Hello World!";
        try(FileOutputStream fileOutputStream = new FileOutputStream("D://WORK//Stormnet//QA12//notes.txt")) {
            byte[] buffer = text.getBytes();
            fileOutputStream.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }
}
