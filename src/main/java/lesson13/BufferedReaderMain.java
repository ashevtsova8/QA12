package lesson13;

import java.io.*;

public class BufferedReaderMain {
    public static void main(String[] args) {
        //считываем посимвольно
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("notes6.txt"))) {
            int c;
            while ((c = bufferedReader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println();

        //считываем построчно
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("notes6.txt"))) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("notes8.txt"))) {
            String s;
            while (!(s = bufferedReader.readLine()).equals("ESC")) {
                bufferedWriter.write(s + "\n");
                bufferedWriter.flush();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
