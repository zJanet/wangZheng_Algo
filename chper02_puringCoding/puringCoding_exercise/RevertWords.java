package chper02_puringCoding.puringCoding_exercise;

import java.util.Arrays;

public class RevertWords {
    public static void main(final String[] args) {
        final String inputStr_1 = "  a gb  ";
        final String inputStr_2 = "the sky is blue";
        final String inputStr_3 = "  a g b ";
        // char[] t1 = "acbd".toCharArray();
        // RevertWords.reverse(t1, 0, 3);
        // System.out.println(Arrays.toString(t1));
        System.out.println(RevertWords.reverseSentence(inputStr_2));

        // String newStr = inputStr.replaceAll("\\s+", " ");

        // System.out.println(reverseWords(inputStr));
        // char[] inputChar = inputStr_1.toCharArray();
        // System.out.println(inputChar.length);
        // System.out.println(RevertWords.trim(inputChar));
        // System.out.println("=============");
    }
    public static String reverseSentence(String sentence){
        char[] charArr = sentence.toCharArray();
        int legalSentenceLen = trim(charArr);
        if (legalSentenceLen == 0) return "";
        reverse(charArr, 0, legalSentenceLen-1);
        int wordStart = 0;
        while (wordStart < legalSentenceLen) {
            int wordEnd = wordStart;
            while (wordEnd<legalSentenceLen && charArr[wordEnd] !=' '){
                wordEnd++;
            }
            reverse(charArr, wordStart, wordEnd-1);
            wordStart = wordEnd+1;
        }
        char[] processedArr = new char[legalSentenceLen];
        for (int j=0; j<legalSentenceLen; ++j){
            processedArr[j]=charArr[j];
        }

        return new String(processedArr);
    }

    private static void reverse(char[] str, int p, int r) {
        int mid = (p+r)/2;
        for (int i = p; i<=mid; i++) {
            char tmp = str[i];
            str[i]= str[r-i+p];
            str[r-i+p] = tmp;
        }
        // for (int i=p; i<mid; i++){
        //     char tmp = str[i];
        //     str[i] = str[r-i];
        //     str[r-i] = tmp;
        // }
    }
    private static int trim(char[] inputChar){
        int inputLen = inputChar.length;
        int i=0;
        int k=0; // lenght of trimed char array
        while (i < inputLen && inputChar[i] == ' '){ // remove leading space
                i++;
        }
        while (i < inputLen){ // remove space in the middle on 
            if (inputChar[i] == ' '){
                if (i+1 < inputLen && inputChar[i+1] != ' '){
                    inputChar[k++] = ' ';
                }
            } else {
                inputChar[k++] = inputChar[i];
            }
            i++;
        }
        return k;
    }
    // public static String reverseWords(String inputStr){
    // }
    // public static String reverseWords(String s) {
    //     // trim the input String to remove leading and tailing 
    //         String trimedStr = s.trim();
    //     // use regular expression to remove duplicataed space
    //         String removedDuplicatedSpace = trimedStr.replaceAll("\\s+", " ");
    //     // split String by space, and create a String Array
    //         String [] splitedStr = removedDuplicatedSpace.split(" ");
    //     // loop through the Array, to revert the position and remove duplicated 
    //         int strLen = splitedStr.length;
    //         int numSwap = strLen / 2;
    //         if (numSwap != 0){
    //             for (int i = 0; i < numSwap; i++) {
    //                 String temp = splitedStr[i];
    //                 splitedStr[i] = splitedStr[strLen-1-i];
    //                 splitedStr[strLen-1-i] = temp;
    //             }
    //         }
    //         StringBuilder str1 = new StringBuilder();
    //         for (int i=0; i<splitedStr.length; i++) {
    //             if ((i != splitedStr.length -1) && (splitedStr[i] != " ")){
    //                 str1.append(splitedStr[i] + " ");
    //             } else {
    //                 str1.append(splitedStr[i]);
    //             }
                
    //         }
    //         return str1.toString();
    //         }
}