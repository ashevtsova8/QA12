package lesson13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamMain {
    public static void main(String[] args) {
        String text = "Hello world 3";
        String filePath = "D://WORK//Stormnet//QA12//notes3.txt";
        try(FileOutputStream fileOutputStream =  new FileOutputStream(filePath)) {
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.println(text);
            System.out.println("Запись в файл произведена");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try(PrintStream printStream = new PrintStream("notes4.txt")) {
            printStream.print("Hello\n");
            printStream.println("Welcome");
            printStream.printf("Name: %s\n", "Tom");

            String message = "PrintStream";
            byte[] messageToBytes = message.getBytes();
            printStream.write(messageToBytes);
            System.out.println("The file has been written");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
