package lesson9.strings;

public class SearchInString {
    public static void main(String[] args) {
        String str1 = "myFile.exe";
        boolean start = str1.startsWith("my");
        boolean end = str1.endsWith("exe");
        System.out.println(start);
        System.out.println(end);

        String str2 = "This is a new string";
        System.out.println(str2);
        System.out.println("indexOf(i) - " + str2.indexOf('i'));
        System.out.println("lastIndexOf(i) - " + str2.lastIndexOf('i'));
        System.out.println("indexOf(is) - " + str2.indexOf("is"));
        System.out.println("lastIndexOf(is) - " + str2.lastIndexOf("is"));
        System.out.println("indexOf(i, 4) - " + str2.indexOf('i', 4));
        System.out.println("lastIndexOf(i, 4) - " + str2.lastIndexOf('i', 4));
        System.out.println("indexOf(is, 4) - " + str2.indexOf("is", 4));
        System.out.println("lastIndexOf(is, 4) - " + str2.lastIndexOf("is", 4));
    }
}
