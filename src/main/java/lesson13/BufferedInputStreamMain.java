package lesson13;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStreamMain {
    public static void main(String[] args) {
        String text = "Hello world2";
        byte[] buffer = text.getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buffer);
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream)) {
            int c;
            while ((c = bufferedInputStream.read()) != -1) {
                System.out.print((char) c);
            }
        } catch(IOException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println();
    }
}
