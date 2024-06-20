package lesson9.strings;

public class GetFromString {
    public static void main(String[] args) {
        String str1 = "Java";
        char c = str1.charAt(2);
        System.out.println(c);

        String str2 = "Hello World!";
        int start = 6;
        int end = 10;
        char[] chars = new char[end - start];
        str2.getChars(start, end, chars, 0);
        System.out.println(chars);
    }
}
