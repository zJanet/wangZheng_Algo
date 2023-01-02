package chper02_puringCoding.puringCoding_exercise;

import java.util.Arrays;

public class RevertString {
    public static void main(String[] args) {
    //    char[] s = {'h','e','l','l','o'};
        char[] s = {'h','e','l','o'};
       reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    public static void reverseString(char[] s){
        int len = s.length;
        if (len>1){
            int mid = len / 2;
            for (int i=0; i<=mid; i++){
                char temp = s[i];
                s[i] = s[len-i-1];
                s[len-i-1] = temp;
            }
        }
    }
}