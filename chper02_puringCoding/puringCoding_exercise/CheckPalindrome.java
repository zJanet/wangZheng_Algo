package chper02_puringCoding.puringCoding_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CheckPalindrome {
    public static void main(String[] args) {
        String ss = "0P";
        System.out.println(isPalindrome(ss));
        
    }
    public static boolean isPalindrome(String s) {
        String[] splitedS = s.split("");
        System.out.println(Arrays.toString(splitedS));
        List<String> alphanumericOnly = new ArrayList<String>();
        for (String str: splitedS){
                if (str.matches("[a-zA-Z0-9]")){
                alphanumericOnly.add(str);

            }
            
        }
        System.out.println(String.join(", ", alphanumericOnly));
        
        int alphanumericOnlyLen = alphanumericOnly.size();
        int numsToCheck = alphanumericOnlyLen / 2;
        for (int i=0; i<numsToCheck; i++) {
            if (!alphanumericOnly.get(i).equalsIgnoreCase(alphanumericOnly.get(alphanumericOnlyLen - i -1))) {
                return false;
            }
        }
        return true;
    }
}