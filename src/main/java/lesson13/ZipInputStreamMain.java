package lesson13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipInputStreamMain {
    public static void main(String[] args) {
        try(ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream("D://WORK//Stormnet//SomeDir//output.zip"))) {
            ZipEntry entry;
            String name = null;
            long size;
            while((entry = zipInputStream.getNextEntry()) != null) {
                name = entry.getName();
                size = entry.getSize();
                System.out.printf("File name: %s, File Size: %d\n", name, size);
            }
            //распаковка
            FileOutputStream fileOutputStream = new FileOutputStream("D://WORK//Stormnet//SomeDir//new" + name);
            for (int i = zipInputStream.read(); i != -1; i = zipInputStream.read()) {
                fileOutputStream.write(i);
            }
            fileOutputStream.flush();
            zipInputStream.closeEntry();
            fileOutputStream.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
