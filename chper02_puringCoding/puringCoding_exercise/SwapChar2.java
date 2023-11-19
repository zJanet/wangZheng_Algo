package chper02_puringCoding.puringCoding_exercise;

import java.util.Arrays;

public class SwapChar2 {
    public static void main(String[] args) {
        char [] t1 = new char[]{'d','e','f'};
        SwapChar2.reverseString(t1);
        // System.out.println(t1);
        // int [] nums = new int[]{3, 4, 5, 6};
        System.out.println(Arrays.toString(t1));
        
    }
    public static void reverseString(char[] s) {
        int len = s.length;
        for (int i=0; i<len/2; i++){
            char tmp = s[i];
            s[i]=s[len-1-i];
            s[len-1-i]=tmp;
        }


        // int i = 0;
        // int j = s.length;
        // while (i<j){
        //     char tmp = s[i];
        //     s[i]=s[j-1];
        //     s[j-1]=tmp;
        //     i++;
        //     j--;
        // }   
    }
}