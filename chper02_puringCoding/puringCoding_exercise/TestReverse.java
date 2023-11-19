package chper02_puringCoding.puringCoding_exercise;

import java.util.Arrays;

public class TestReverse {
   public static void main(String[] args) {
       char[] waitingReverse = {'t','o','p',' ','m','u','c'};
       System.out.println(Arrays.toString(reverseWord(4, 6, waitingReverse)));
       System.out.println(Arrays.toString(reverseWord(0, 2, waitingReverse)));

   } 
   public static char[] reverseWord(int start, int end, char[] waitingReverse){
        int mid = (start+end)/2;
        int i = start;
        while (i <= mid){
            char temp = waitingReverse[i];
            waitingReverse[i] = waitingReverse[end - (i-start)];
            waitingReverse[end-(i-start)] = temp; 
            i++; 
        }
        // for(int i=start; i<=mid; i++){
        //     char temp = waitingReverse[i];
        //     waitingReverse[i] = waitingReverse[end - (i-start)];
        //     waitingReverse[end-(i-start)] = temp;
        // }
        return waitingReverse;
   }
}