package chper02_puringCoding.puringCoding_exercise;

public class IsPalindrome {
    public static void main(String[] args) {
        int numToTest = 123;
        System.out.println(isPalinedrome(numToTest));
    }
    public static boolean isPalinedrome(int number) {
        if (number < 0){
            return false;
        }
        if (number >=0 && number < 10){
            return true;
        }
        String numStr = Integer.toString(number);
        String[] numArray = numStr.split("");

        int numLen = numArray.length;
        int iterateNum = numLen/ 2;
        for (int i=0; i<iterateNum; i++) {
            String a = numArray[i];
            String b = numArray[numLen-i-1];
            if (!numArray[i].equals(numArray[numLen-i-1])) {
                return false;
            }
        }
        return true;
    }
}