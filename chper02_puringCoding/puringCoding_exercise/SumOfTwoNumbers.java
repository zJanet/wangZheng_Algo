package chper02_puringCoding.puringCoding_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfTwoNumbers {
    /* Problem Soving steps:
    step1. Use example to learn problem's request
    step2. Write test cases
    step3. Summarize the repeated logic
    (check if there are repeated logic, and abstract it)
    step4. first round code writing 
    (write comments to modulize code, and tidy your problem sovling logic)
    step5. use test cases to validate, and optimize your code*/

    // Step1. use example to learn problem's request
    /* 
       given arrray nums, and a integer number target
       nums = [2, 7, 11, 15], target = 9

       find two numbers, which can be added together to get the target number;
       return an int array with these two numbers' index
       output [0,1]

       you can assume for each input there are only one answer for it;
       each number inside the nums array can only be used once
       e.g. for nums = [2, 3, 1, 9], target = 4
       output [1, 2] or [2, 1] can't be [0, 0]

    */

    // Step2. write test cases
    /*    
        nums = [2, 2, 11, 15], target = 4
        output [0, 1] or [1, 0], shouldn't be [0, 0] or [1, 1]

        nums = [3, 4, 5, 6] target 8
        output [0, 2] or [2, 0], shouldn't be [1, 1]
    */

    // Step3. summarize if there are repeative logics, abstract it into method
    /* 
     for each num inside the nums Array, check if there are Target - num exists
    */

    // Step 4. first round code writing 
    public static void main(String[] args) {
        // nums = [2, 7, 11, 15], target = 9
        // int [] nums = new int[]{2, 7, 11, 15};
        // nums = [3, 4, 5, 6] target 8
        int [] nums = new int[]{3, 4, 5, 6};
        System.out.println(Arrays.toString(sumOfTwoNumbers(nums, 8)));
        
    }

    // public static int[] sumOfTwoNumbers(int[] nums, int target){
    //     // cycle through the nums for each num find if there are target - num exist
    //     int [] result = new int[2];
    //     for (int i=0; i < nums.length; i++){
    //         int remaining = target - nums[i];
    //         for (int j = i+1; j < nums.length; j++){
    //             if (nums[j] == remaining) {
    //                 result[0] = i;
    //                 result[1] = j;
    //             }
    //         }
    //     }
    //     return result;
    // }

    // {3, 4, 5, 6};
    public static int[] sumOfTwoNumbers(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (map.containsKey(remaining)){
                return new int[] {map.get(remaining), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {};
        
    }


}