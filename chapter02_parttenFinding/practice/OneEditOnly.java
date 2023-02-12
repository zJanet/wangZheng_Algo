package chapter02_parttenFinding.practice;

public class OneEditOnly {
   public static void main(String[] args) {  
       System.out.println(oneEditAway("teacher", "beacher"));
   } 
   public static boolean oneEditAway(String first, String second) {
    int firstLen = first.length();
    int secondLen = second.length();
    if (Math.abs(firstLen - secondLen) > 1) return false;

    char [] first_char = first.toCharArray();
    char [] second_char = second.toCharArray();
    int diff = 0;
        for (int i = 0, j = 0; i<firstLen && j <secondLen; i++, j++){
                if (first_char[i] != second_char[j]){
                    diff++;
                    if (diff > 1) return false; 
                    if (firstLen > secondLen) {
                        j--;
                    }else if (firstLen < secondLen) { // need to specify condition, in case firstLen==secondLen, then both need to increase by 1
                        i--;
                    }   
                }
        }
    return true;
}

}