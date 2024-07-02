package lesson13;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamMain {
    public static void main(String[] args) {
        byte[] array1 = new byte[]{1, 2, 3, 4};
        ByteArrayInputStream byteArrayInputStream =  new ByteArrayInputStream(array1);
        int b;
        while ((b = byteArrayInputStream.read()) != -1) {
            System.out.println(b);
        }

        String text = "Hello World!";
        byte[] array2 = text.getBytes();
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(array2);
        int c;
        while((c = byteArrayInputStream2.read()) !=  -1) {
            System.out.print((char) c);
        }
    }
}
