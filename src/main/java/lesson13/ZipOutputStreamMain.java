package lesson13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamMain {
    public static void main(String[] args) {
        String fileName = "D://WORK//Stormnet//SomeDir//myNewFile.txt";
        try(ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream("D://WORK//Stormnet//SomeDir//output.zip"))) {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ZipEntry entry1 = new ZipEntry("myNewFile.txt");
            zipOutputStream.putNextEntry(entry1);
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            //добавляем содержимое к архиву
            zipOutputStream.write(buffer);
            zipOutputStream.closeEntry();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
