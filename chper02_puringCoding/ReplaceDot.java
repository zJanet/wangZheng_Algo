package chper02_puringCoding;

public class ReplaceDot {
    public static void main(String[] args) {
        System.out.println(defangIpaddr("123.345.678.999"));
    }
    public static String defangIpaddr(String address) {
        //         return address.replace(".", "[.]");

        // in java String type is immutable, need to call it's method to get each char
        // change the input String to an char array
        
        
        /* Solution 1
        
        char[] original = address.toCharArray();
        int length = original.length;
        int newLengh = length + 2*3;
        char [] newStr = new char[newLengh];
        int k = 0;
        for (int i = 0; i < length; i++) {
            if (original[i] != '.') {
                newStr[k] = original[i];
                k++;
            } else {
                newStr[k++] = '[';
                newStr[k++] = '.';
                newStr[k++] = ']';
            }
        }
        return new String(newStr);
    } */
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < address.length(); i++){
        char c = address.charAt(i);
        if ( c != '.'){
            stringBuilder.append(c);
        } else {
            stringBuilder.append("[.]");
        }
    }

    return stringBuilder.toString();
    }
}