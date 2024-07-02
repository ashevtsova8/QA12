package lesson13;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamMain {
    public static void main(String[] args) {
        String filePath =  "D://WORK//Stormnet//QA12//notes.txt";
        String filePathNew =  "D://WORK//Stormnet//QA12//notesNew.txt";

        try(FileInputStream fileInputStream = new FileInputStream(filePath)) {
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("\nThe file has been read");


        try(FileInputStream fileInputStream1 = new FileInputStream(filePath)) {
            byte[] buffer = new byte[fileInputStream1.available()];
            fileInputStream1.read(buffer, 0, fileInputStream1.available());
            System.out.println("File data:");
            for (int i = 0; i < buffer.length; i++) {
                System.out.print((char) buffer[i]);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("\nThe file has been read again");


        try(FileInputStream fileInputStream2 = new FileInputStream(filePath);
            FileOutputStream fileOutputStream2 =  new FileOutputStream(filePathNew)) {
            byte[] buffer = new byte[fileInputStream2.available()];
            //считаем буфер
            fileInputStream2.read(buffer, 0, buffer.length);
            //записываем из буфера в файл
            fileOutputStream2.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("\nThe file has been read again");
    }
}
