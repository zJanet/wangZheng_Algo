package chper02_puringCoding.puringCoding_exercise;

public class RemoveDuplicated {
    public static void main(String[] args) {
        // 输入：
        int[] nums = new int[] {1,1,2};
        // 输出：2, nums = [1,2,_] 
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int orgLen = nums.length;
        int legalLen = 1;
        int currentIndex = 1;
        while (currentIndex < orgLen){
            if(nums[currentIndex] != nums[currentIndex-1]){
                nums[legalLen++] = nums[currentIndex];
            }
            currentIndex++;
        }
        return legalLen;
    }
}