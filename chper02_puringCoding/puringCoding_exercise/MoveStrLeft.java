package chper02_puringCoding.puringCoding_exercise;

public class MoveStrLeft {
    public static void main(String[] args) {
//         输入: 
        String  s = "abcdefz";
    // , k = 2
// 输出: "cdefgab"
        System.out.println(reverseLeftWords(s, 2));
    }
    public static String reverseLeftWords(String s, int n) {
        char[] charArr = s.toCharArray();
        int k = 0;
        // while (k<n){
        for(int i=0; i<n; i++){
            char tmp = charArr[0];
            for (int j=1; j<s.length(); j++){
                charArr[j-1] = charArr[j];
            }
            charArr[s.length()-1] = tmp;
            k++;
        }
        // }
        return new String(charArr);
        // StringBuilder strBuilder = new StringBuilder();
        // for (int i = 0; i <n; i++){
        //     strBuilder.append(Character.toString(s.charAt(i)));
        // }
        // String firstNStr = strBuilder.toString();
        // String result = s.split(firstNStr)[1] + firstNStr;
        // return result;

    }
}