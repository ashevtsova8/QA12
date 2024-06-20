package lesson9.strings;

public class StringMethods {
    public static void main(String[] args) {
        String str = "";
        if (str.length() == 0) {
            System.out.println("Это пустая строка");
        }

        //исключение nullPointer,т.к. строка = null
//        String str1 = null;
//        if (str1.length() == 0) {
//            System.out.println("Это пустая строка");
//        }
    }
}

