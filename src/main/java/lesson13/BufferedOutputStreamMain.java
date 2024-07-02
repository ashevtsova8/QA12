package lesson13;

import java.io.*;

public class BufferedOutputStreamMain {
    public static void main(String[] args) {
        String text = "Hello world2";
        try(FileOutputStream fileOutputStream = new FileOutputStream("notes1.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {
            byte[] buffer = text.getBytes();
            bufferedOutputStream.write(buffer, 0, buffer.length);
        } catch(IOException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println();
    }
}
