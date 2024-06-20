package lesson9.strings;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        String str3 = "Hello world";
        String str4 = "I work";
        boolean result = str3.regionMatches(6, str4, 2, 3);
        System.out.println(result);

        String str5 = "hello";
        String str6 = "world";
        String str7 = "hell";

        System.out.println(str5.compareTo(str6));
        System.out.println(str5.compareTo(str7));

    }
}
