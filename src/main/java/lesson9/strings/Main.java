package lesson9.strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String();//пустая строка
        String str3 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[]{'h', 'e', 'l', 'l', 'o'}, 2, 2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        char[] chars = {'a', 'b', 'c'};
        String str5 = new String(chars);

        char[] chars1 = {'a', 'b', 'c', 'd', 'e', 'f'};
        String str6 = new String(chars1, 2, 3);

        char[] chars2 = {'J', 'a', 'v', 'a'};
        String str7 = new String(chars2);
        String str8 = new String(str7);

        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);

        byte[] ascii = {65, 66, 67, 68, 69, 70};
        String str9 = new String(ascii);
        System.out.println(str9);
        String str10 = new String(ascii, 2, 3);
        System.out.println(str10);

        char[] chars3 = {'a', 'b', 'c'};
        String str11 = new String(chars3);
        System.out.println(str11.length());

        String str12 = "This is a string";
        char[] chars4 = str12.toCharArray();
        System.out.println(Arrays.toString(chars4));

    }
}
