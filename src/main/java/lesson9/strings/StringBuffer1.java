package lesson9.strings;

public class StringBuffer1 {
    public static void main(String[] args) {
        String str = "Java";
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer(str);
        System.out.println("Емкость: " + stringBuffer.capacity());
        System.out.println("Емкость: " + stringBuffer1.capacity());
        stringBuffer1.ensureCapacity(32);
        System.out.println("Емкость: " + stringBuffer1.capacity());
        System.out.println("Длина: " + stringBuffer1.length());
        System.out.println(stringBuffer1.toString());

        StringBuffer stringBuffer2 = new StringBuffer("Hello");
        char c = stringBuffer2.charAt(0);
        System.out.println(c);

        stringBuffer2.setCharAt(0, 'h');
        System.out.println(stringBuffer2);

        StringBuffer stringBuffer3 = new StringBuffer("world");
        int startIndex = 1;
        int endIndex = 4;
        char[] chars = new char[endIndex - startIndex];
        stringBuffer3.getChars(startIndex, endIndex, chars, 0);
        System.out.println(chars);

        StringBuffer stringBuffer4 = new StringBuffer("hello");
        stringBuffer4.append(" world");
        System.out.println(stringBuffer4);

        StringBuffer stringBuffer5 = new StringBuffer("world");
        stringBuffer5.insert(3, "IN");
        System.out.println(stringBuffer5);

        StringBuffer stringBuffer6 = new StringBuffer("hello world");
        stringBuffer6.delete(0, 3);
        System.out.println(stringBuffer6);

        StringBuffer stringBuffer7 = new StringBuffer("world");
        stringBuffer7.deleteCharAt(2);
        System.out.println(stringBuffer7);

        StringBuffer stringBuffer8 = new StringBuffer("hello world");
        String s1 = stringBuffer8.substring(6);
        System.out.println(s1);

        StringBuffer stringBuffer9 = new StringBuffer("hello world");
        String s2 = stringBuffer9.substring(2, 4);
        System.out.println(s2);

        StringBuffer stringBuffer10 = new StringBuffer("hello world");
        stringBuffer10.setLength(40);
        System.out.println(stringBuffer10);
        stringBuffer10.setLength(4);
        System.out.println(stringBuffer10);

        StringBuffer stringBuffer11 = new StringBuffer("hello world");
        stringBuffer11.replace(6, 11, "java");
        System.out.println(stringBuffer11);

        StringBuffer stringBuffer12 = new StringBuffer("hello world");
        stringBuffer12.reverse();
        System.out.println(stringBuffer12);
    }
}
