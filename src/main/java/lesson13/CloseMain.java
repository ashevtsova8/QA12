package lesson13;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CloseMain {
    public static void main(String[] args) {
        String filePath =  "D://WORK//Stormnet//QA12//notes.txt";

        //close with try..catch..finally
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }


        //close with resources
        try(FileInputStream fileInputStream1 = new FileInputStream(filePath)){
            int i;
            while ((i = fileInputStream1.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
