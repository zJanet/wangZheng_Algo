package chper02_puringCoding.puringCoding_exercise;


public class RevertWords {
    public static void main(final String[] args) {
        final String inputStr = "a good   example";
        // String newStr = inputStr.replaceAll("\\s+", " ");

        System.out.println(reverseWords(inputStr));


    }
    public static String reverseWords(String s) {
        // trim the input String to remove leading and tailing 
            String trimedStr = s.trim();
        // use regular expression to remove duplicataed space
            String removedDuplicatedSpace = trimedStr.replaceAll("\\s+", " ");
        // split String by space, and create a String Array
            String [] splitedStr = removedDuplicatedSpace.split(" ");
        // loop through the Array, to revert the position and remove duplicated 
            int strLen = splitedStr.length;
            int numSwap = strLen / 2;
            if (numSwap != 0){
                for (int i = 0; i < numSwap; i++) {
                    String temp = splitedStr[i];
                    splitedStr[i] = splitedStr[strLen-1-i];
                    splitedStr[strLen-1-i] = temp;
                }
            }
            StringBuilder str1 = new StringBuilder();
            for (int i=0; i<splitedStr.length; i++) {
                if ((i != splitedStr.length -1) && (splitedStr[i] != " ")){
                    str1.append(splitedStr[i] + " ");
                } else {
                    str1.append(splitedStr[i]);
                }
                
            }
            return str1.toString();
            }
}