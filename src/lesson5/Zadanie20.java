package lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Zadanie20{

    public static void main(String[] args) {
        String s = "Java — объектно-ориентированный язык "
                + "программирования, разработанный компанией "
                + "Sun Microsystems (в последующем приобретённой "
                + "компанией Oracle).";
        Pattern pattern = Pattern.compile("([a-zа-я])\\b");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.print(matcher.group(1));
        }
    }
}