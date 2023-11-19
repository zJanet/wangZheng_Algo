package chper02_puringCoding.puringCoding_exercise;

import java.util.Arrays;

public class TestTrim {
     public static void main(String[] args) {
        char[] waitingTrim = {' ', ' ', 's', ' ', ' ', 'u', 'n', ' ', ' '};
        // int orgLeng = waitingTrim.length;
        // int legalLen=0;
        // int i=0;
        // while (i < orgLeng && waitingTrim[i]==' '){
        //     i++;
        // }
        // while(i<orgLeng){
        //     if (waitingTrim[i] == ' '){
        //         if(i+1 < orgLeng && waitingTrim[i+1] != ' '){
        //             waitingTrim[legalLen++] = waitingTrim[i];
        //         }

        //     } else{
        //         waitingTrim[legalLen++] = waitingTrim[i];
        //     }
        //     i++;
        // }
        // System.out.println(legalLen);
        trim(waitingTrim);
        System.out.println(Arrays.toString(waitingTrim));

        // System.out.println(trim(waitingTrim));

    }
    public static int trim(char[] charArr){
        int orgLen = charArr.length;
        int legalLen = 0;
        int currentIndex = 0;
        while(currentIndex<orgLen && charArr[currentIndex]== ' ') {
            currentIndex++;
        }
        while(currentIndex<orgLen){
            if(charArr[currentIndex] != ' '){
                charArr[legalLen++] = charArr[currentIndex];
                // legalLen = currentIndex;
                // legalLen += 1;
                // legalLen++;
            } else {
                if (currentIndex+1 < orgLen && charArr[currentIndex+1] != ' '){
                    charArr[legalLen++] = ' ';
                    // charArr[legalLen++] = charArr[currentIndex];
                    // legalLen = currentIndex;
                    // legalLen +=1;
                    // legalLen++;
                }
            }
             currentIndex++;
        }
        return legalLen;
    }
}