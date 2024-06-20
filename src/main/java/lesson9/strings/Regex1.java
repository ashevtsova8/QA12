package lesson9.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String regex = "java";
        String regex1 = "\\d{3}";//шаблон строки из 3 цифровых символов

        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);

        //жадный режим (самое длинное совпадение)
        //сверхжадный режим
        //ленивый режим(самое короткое совпадение)

        //жадный
        String text = "Егор Алла Александр";
        Pattern pattern1 = Pattern.compile("А.+а");
        Matcher matcher = pattern1.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }

        String text1 = "Алла";
        boolean isMatch = Pattern.matches("А.+а", text1);
        System.out.println(isMatch);

        boolean isMatch2 = Pattern.matches(".*А.+а.*", text);
        System.out.println(isMatch2);


        String text2 = "ааабва";
        Pattern pattern2 = Pattern.compile("а++");
        Matcher matcher1 = pattern2.matcher(text2);
        while (matcher1.find()) {
            System.out.println(text2.substring(matcher1.start(), matcher1.end()));
        }

        //ленивый режим
        String text3 = "Егор Алла Александр";
        Pattern pattern3 = Pattern.compile("А.+?а");
        Matcher matcher3 = pattern3.matcher(text3);
        while (matcher3.find()) {
            System.out.println(text.substring(matcher3.start(), matcher3.end()));
        }
    }
}
