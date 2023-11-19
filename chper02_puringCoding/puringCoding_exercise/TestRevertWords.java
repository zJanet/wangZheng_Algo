package chper02_puringCoding.puringCoding_exercise;

import java.util.Arrays;

public class TestRevertWords {
   public static void main(String[] args) {
    final String inputStr_2 = "the sky is blue";
    final String inputStr_1 = "  hello world!  ";
    // System.out.println(Arrays.toString(ReverseSentence(inputStr_2)));
    System.out.println(ReverseSentence(inputStr_1));

   } 
   public static String ReverseSentence(String sentence){
       char[] charArr = sentence.toCharArray();
       int legalLen = TestTrim.trim(charArr);
       if (legalLen == 0) return "";

       TestReverse.reverseWord(0, legalLen-1, charArr);
       int wordStart = 0;
       while (wordStart<legalLen-1){
            int wordEnd = wordStart;
            while(wordEnd<legalLen && charArr[wordEnd]!=' '){
               wordEnd++;
           }
           TestReverse.reverseWord(wordStart, wordEnd-1, charArr);
           wordStart = wordEnd+1;
       }
       char[] resultChar = new char[legalLen];
       for (int i = 0; i<legalLen; i++){
           resultChar[i]=charArr[i];
       }

    //    return Arrays.toString(resultChar);
       return new String(resultChar);


   }

}