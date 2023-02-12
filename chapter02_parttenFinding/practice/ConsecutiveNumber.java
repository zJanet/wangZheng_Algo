package chapter02_parttenFinding.practice;

import java.util.HashSet;
import java.util.Set;

public class ConsecutiveNumber {
    public static void main(String[] args) {
        int [] tt = new int[]{0,0,1,2,10};
        System.out.println(isStraight(tt));

    }

    public static boolean isStraight(int[] nums) {
        // find max and min, max - min < 5
        // no repeat other than 0 
        Set<Integer> noRepeat = new HashSet<>();
        int max = 0;
        int min = 14;
        for (int num : nums){
            if (num == 0) continue;
            if (noRepeat.contains(num)){
                return false;
            } else {
                noRepeat.add(num);
                if (num>max){
                    max = num;
                }
                if (num<min){
                    min = num;
                }
            }
        }
        return max - min < 5;
    }

}