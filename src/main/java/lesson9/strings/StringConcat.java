package lesson9.strings;

public class StringConcat {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Hello";
        String str3 = str1 + " " + str2;
        System.out.println(str3);

        String str4 = str1 + 40;
        System.out.println(str4);

        int int1 = 1;
        String str5 = String.valueOf(int1);
        System.out.println(str5);

        System.out.println(str1.concat(str2));//concat
        System.out.println(String.join(" ", str2, str1));//join
    }
}
