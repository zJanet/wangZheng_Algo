package chper02_puringCoding.puringCoding_exercise;

public class StrToInt {
    public static void main(String[] args) {
        String test = "-21474836482";
        // String test = "   "; //return 0
        // String test = "   -4m2"; //return -42
        // String test = "4193zbc"; //return 4193
        // String test = "abc987"; //return 0
        // String test = "-99999999999"; //return Integer.MIN_VALUE
        // String test = "99999999999"; //return Integer.MAX_VALUE
        // String test = ""; //empty string, return 0
        // String test = "   "; //white space only,return 0

        System.out.println(strToInt(test));
    }
    // 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。

    // 第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。
    // 在任何情况下，若函数不能进行有效的转换时，请返回 0
    // 假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−231,  231 − 1]。
    // 如果数值超过这个范围，请返回  INT_MAX (231 − 1) 或 INT_MIN (−231)
      
    public static int strToInt(String str){
        char[] chars = str.toCharArray();
        int n = chars.length;

        // handle empty case:
        if (n==0) return 0;
        
        // handle leading space
        int i = 0;
        while (i < n && chars[i] == ' '){
            i++;
        }
        // white space only case
        if (i == n) return 0;

        int sign = 1;
        char c = chars[i];
        if (c == '-') {
            sign = -1;
            i++;
        }else if (c == '+'){
            sign = 1;
            i++;
        }
        // char to int 
        // int number's range -2147483648 ~ 2147483647
        int result = 0;
        while (i < n && chars[i] >= '0' && chars[i] <='9') {
            int d = chars[i] - '0';
            if (sign == 1){
                if (result > Integer.MAX_VALUE/10){
                 return Integer.MAX_VALUE;
                } else if (result == Integer.MAX_VALUE/10 && d > 7){
                    return Integer.MAX_VALUE;
                }
                result = result*10+d;
            } else {
                if (result < Integer.MIN_VALUE/10){
                    return Integer.MIN_VALUE;
                } else if (result == Integer.MIN_VALUE/10 && d >8){
                    return Integer.MIN_VALUE;
                }
                result = -(Math.abs(result)*10+d);
            }
            i++;
        }
        return result;
    }
}


// class Solution {
//     public int myAtoi(String str) {
//         if(str==null||str.length()==0){
//             return 0;
//         }

//         int sign=1;
//         int i=0;
//         int len=str.length();
//         while(i<len&&str.charAt(i)==' '){
//             i++;
//         }
//         if(i<len&&str.charAt(i)=='-'){
//             sign=-1;
//             i++;
//         }else if(i<len&&str.charAt(i)=='+'){
//             i++;
//         }

//         long ans=0;
//         for(;i<len;++i){
//             if(str.charAt(i)<'0'||str.charAt(i)>'9'){
//                 return sign*(int)ans;
//             }
//             ans=ans*10+(str.charAt(i)-'0');
//             if(ans>Integer.MAX_VALUE){
//                 return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
//             }
//         }

//         return sign*(int)ans;
//     }
// }