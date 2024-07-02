package lesson13;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderMain {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("notes6.txt")) {
            //читаем посимвольно
            int c;
            while ((c = fileReader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(FileReader fileReader = new FileReader("notes6.txt")) {
            char[] buf = new char[256];
            int c;
            while ((c = fileReader.read()) != -1) {
                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
