package chper02_puringCoding.puringCoding_exercise;

public class IsPalindromeNum {
    public static void main(String[] args) {
        int checkNum  = 235;
        System.out.println(isPalindrome(checkNum));
    }
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int backupX = x;
        int y = 0; // y is the reversed x
        while (x != 0){
            y = y*10 + x % 10;
            x = x / 10;
        }
        return backupX == y;
    }
}