package chapter02_parttenFinding.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShorterLongBoards {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(divingBoard(1, 2, 3)));
    }
    public static int[] divingBoard(int shorter, int longer, int k) {
        // int [] result = new int[]{};
        List<Integer> list = new ArrayList<>();

        if (k == 0) return new int[]{};
        if (shorter == longer) return new int[]{shorter*k};
        for (int i = k; i>=0; i--){
            int shortSum = i*shorter;
            int longSum = (k-i)*longer;
            list.add(shortSum+longSum);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}