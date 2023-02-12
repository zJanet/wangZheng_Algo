package chper02_puringCoding.parttenFinding;

public class ConsecutiveCardsNumber {
    public static void main(String[] args) {
        /* 
        Problem description:
        for a given array with leng 5, and each number inside range [0,13]
        and 0 can be treat as any number, check if the 5 number are consecutive
         */
        
         /* 
        rule 1. each of these 5 number, except 0, need to be unique
        rule 2. the max - min need to less than 5
        */
        // int [] text1 = new int[]{1, 2, 3, 4, 5};
        // int [] text1 = new int[]{1, 0, 0, 0, 5};
        int [] text1 = new int[]{1, 1, 0, 0, 3};

        System.out.println(isConsecutive(text1));
    }

    public static boolean isConsecutive(int[] givenArray){
        // initialize vlocal ariable to save the max and min number of this array
        int min = 100;
        int max = -1;

        // loop through the array to check if there are any duplicated number except 0
        // use boolean array with lengh 14, to represent whether number in [0,13] has occurred
        boolean [] duplicateChecking = new boolean[14];
        // update the max and min accordingly 
        for (int i = 0; i < 5; i++){
            int currentNum = givenArray[i];
            if (currentNum != 0){
                if (duplicateChecking[currentNum]){
                    return false;
                } else {
                    if (currentNum > max) {
                        max = currentNum;
                    }
                    if (currentNum < min) {
                        min = currentNum;
                    }
                    duplicateChecking[currentNum] = true;
                }
            }
        }
        return max - min < 5;
    }
    
}