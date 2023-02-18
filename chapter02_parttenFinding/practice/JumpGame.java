package chapter02_parttenFinding.practice;

public class JumpGame {
    public static void main(String[] args) {
        // reference https://blog.csdn.net/Shaosenmonitor/article/details/124744649
        // reference https://cloud.tencent.com/developer/article/1805823
        // int[] nums  = new int[] {2,3,1,1,4};
        // int[] nums  = new int[] {3,2,1,0,4};
        // int[] nums  = new int[] {0};
        // int[] nums  = new int[] {2,5,0,0};
        // int[] nums  = new int[] {0,1};
        int[] nums  = new int[] {1, 1};
        // int[] nums  = new int[] {2,3,1,1,4};
        // int[] nums  = new int[] {3,0,8,2,0,0,1};


        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int targetStep = nums.length -1;
        // for each step get the farest step it can arrive, check if can reach the target
        // keep farest step it can go on parameter "globalFarestStepCanArrive"
            // farest index we can acess up to now
            int globalFarestStepCanArrive=0;
            // loop the given array
            for (int currentIndex=0; currentIndex<nums.length; currentIndex++){
                // make sure that index to go within range of farest index we can access up to now
                if (globalFarestStepCanArrive >= currentIndex){
                    // get farest step we can go on current index
                    int farestStepCanArriveOnCurrentIdex = currentIndex + nums[currentIndex]; //the goal is to check if can reach, so take largest step on each arrivable index to check
                    // check if we can jump to the final index on current location
                    if (farestStepCanArriveOnCurrentIdex >= targetStep){
                        // if yes, end loop and return true
                        return true;
                    }
                    // if we can't jump to the final index on current location: update the farest index we can access up to now 
                    // if (farestStepCanArriveOnCurrentIdex > globalFarestStepCanArrive) globalFarestStepCanArrive = farestStepCanArriveOnCurrentIdex;
                    globalFarestStepCanArrive = Math.max(farestStepCanArriveOnCurrentIdex, globalFarestStepCanArrive);
                } else {
                    return false;
                }
            }
            return false;
    }
}