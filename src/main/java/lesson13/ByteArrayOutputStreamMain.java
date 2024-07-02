package lesson13;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamMain {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String text = "Hello World!";
        byte[] buffer = text.getBytes();
        try {
            byteArrayOutputStream.write(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        //превращаем массив байтов в строку
        System.out.println(byteArrayOutputStream.toString());

        byte[] array = byteArrayOutputStream.toByteArray();
        for (byte b : array) {
            System.out.print((char) b);
        }

        ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
        byte[] buffer1 = text.getBytes();
        try {
            byteArrayOutputStream1.write(buffer1);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try(FileOutputStream fileOutputStream = new FileOutputStream("Hello.txt")) {
            byteArrayOutputStream1.writeTo(fileOutputStream);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
