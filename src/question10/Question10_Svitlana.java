package question10;

import java.util.Arrays;
import java.util.TreeSet;

public class Question10_Svitlana {
    public static boolean sameLetters(String str1, String str2) {
        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        System.out.println(sameLetters("abc", "cab"));
        System.out.println(sameLetters("abc", "abb"));
    }
}
