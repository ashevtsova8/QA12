package lesson9.strings;

public class SubString {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String replaceStr1 = str1.replace('l', 'k');
        String replaceStr2 = str1.replace("Hello", "Bye");
        System.out.println(replaceStr1);
        System.out.println(replaceStr2);

        String str2 = "  Hello World   ";
        System.out.println(str2.trim());

        String str3 = "Hello World";
        String subString1 = str3.substring(6);
        String subString2 = str3.substring(3, 8);
        System.out.println(subString1);
        System.out.println(subString2);
    }
}
