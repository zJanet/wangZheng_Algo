package chper02_puringCoding.puringCoding_exercise;

import java.util.Arrays;

public class LenOfLastWord {
    public static void main(String[] args) {
        String t1 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(t1));
    }
    public static int lengthOfLastWord(String s) {
        int orgLen = s.length();
        int currentIndex = orgLen - 1;
        while (currentIndex >= 0 && s.charAt(currentIndex) == ' '){
            currentIndex--;
        }
        if (currentIndex < 0) return 0;
        int lastWordLen = 0;
        while(currentIndex >= 0 && s.charAt(currentIndex) != ' '){
            lastWordLen++;
            currentIndex--;
        }
        return lastWordLen;
        // String[] splitedStr = s.split("\\s+");
        // System.out.println(Arrays.toString(splitedStr));
        // String lastStr = splitedStr[splitedStr.length-1];
        // return lastStr.length();
    }
}