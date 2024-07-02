package lesson13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterMain {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "D://WORK//Stormnet//QA12//notes3.txt";
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("Hello");
        writer.flush();
        writer.close();

        PrintWriter writer2 = null;
        writer2 = new PrintWriter(new File(filePath));
        writer2.write("Updated information");
        writer2.flush();
        writer2.close();
    }
}
