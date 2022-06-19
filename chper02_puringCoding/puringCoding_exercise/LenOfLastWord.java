package chper02_puringCoding.puringCoding_exercise;

import java.util.Arrays;

public class LenOfLastWord {
    public static void main(String[] args) {
        String t1 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(t1));
    }
    public static int lengthOfLastWord(String s) {
        String[] splitedStr = s.split("\\s+");
        System.out.println(Arrays.toString(splitedStr));
        String lastStr = splitedStr[splitedStr.length-1];
        return lastStr.length();
    }
}