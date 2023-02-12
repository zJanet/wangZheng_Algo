package chapter02_parttenFinding.practice;

import java.util.Arrays;
public class MasterMind {
    public static void main(String[] args) {
        String solution = "YYRG";
        String guess = "RRRR";

        System.out.println(Arrays.toString(masterMind(solution, guess)));
    }
    public static int[] masterMind(String solution, String guess) {
        char [] solutionChar = solution.toCharArray();
        char [] solutionCharCopy = solutionChar.clone();
        char [] guessChar = guess.toCharArray();
        int accurate = 0;
        int raw=0;

        for(int i = 0; i<guessChar.length; i++){
            if (guessChar[i] == solutionChar[i]){
                accurate++;
            }
            for (int j=0; j <solutionCharCopy.length; j++){
                if (solutionCharCopy[j] == guessChar[i]){
                    raw++;
                    solutionCharCopy[j] = '0';
                    break;
                }
            }
        }
        return new int[]{accurate, raw-accurate};
    }
}