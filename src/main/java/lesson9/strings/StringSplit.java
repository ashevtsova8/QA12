package lesson9.strings;

public class StringSplit {
    public static void main(String[] args) {
        String str1 = "This is a string";
        String[] parts = str1.split(" ");

        for (String s : parts) {
            System.out.println(s);
        }

        //String pool
        String str2 = "hello";
        String str3 = "hello"; //в динамической памяти хранится только 1 объект hello
    }
}
