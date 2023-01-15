package chper02_puringCoding.puringCoding_exercise;

public class CheckPalindromeStr {
    public static void main(String[] args) {
        String ss = "?0P,0";
        System.out.println(ispalindromeStr(ss));
    }
    public static boolean ispalindromeStr(String str){
        // empty str -> true
        // remove non alphanumeric letters
        // switch all small case into captical case
        int i=0;
        int j = str.length()-1;
        while(i<j){
            if (!isAlphanumeric(str.charAt(i))){
                i++;
                continue;
            }
            if (!isAlphanumeric(str.charAt(j))){
                j--;
                continue;
            }
            if (toLowerCase(str.charAt(i)) != toLowerCase(str.charAt(j))){
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
    private static char toLowerCase(char var){
        if (var >='a' && var <='z') return var;
        if (var >='0' && var <='9') return var;
        // captical A~Z(65~90), lower a~z(97~122)
        return (char)((int)var + 32);
    }
    private static boolean isAlphanumeric(char var){
        if (var >='a' && var <='z') return true;
        if (var >='A' && var <='Z') return true;
        if (var >='0' && var <='9') return true;
        return false;
    }
}