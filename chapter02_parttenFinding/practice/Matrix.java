package chapter02_parttenFinding.practice;

import java.util.Arrays;

public class Matrix {
    // (m,n):(1,2) =0, T1 = [[1,0,1],[1,1,1],[1,1,1]]
    //  -> T1_exp = [[0,0,0],[1,0,1],[1,0,1]]
    // (m,n):(2,1) =0, T2 = [[1,1,1],[0,1,1],[1,1,1]]
    //  -> T2_exp = [[0,1,1],[0,0,0],[0,1,1]]
    // [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
     //  -> T1_exp = [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
    public static void main(String[] args) {
        // Matrix m = new Matrix();
        // int[][] originalArr = new int[][]{{1,0,3},{2,3,4}};
        // int[][] originalArr = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        // [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
        int[][] originalArr = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        // Matrix.transform(originalArr);
        // System.out.println(Arrays.deepToString(Matrix.transform(originalArr)));
        // System.out.println(""+originalArr[0][0]+originalArr[0][1]+originalArr[0][2]+originalArr[0][3]);
        // System.out.println(""+originalArr[1][0]+originalArr[1][1]+originalArr[1][2]+originalArr[1][3]);
        // System.out.println(""+originalArr[2][0]+originalArr[2][1]+originalArr[2][2]+originalArr[2][3]);

        System.out.println(Arrays.deepToString(Matrix.transformer3(originalArr)));

    }

    public static int[][] transform(int[][] originalArr) {
        // create a temp array with same column and width as the original array
        int orgHeight = originalArr.length;
        int orgWidth = originalArr[0].length;
        int[][] result = new int[orgHeight][orgWidth];
        
        // fill in the temp array with default value=1
        Arrays.stream(result).forEach(row -> Arrays.fill(row, 1));
        // System.out.println(Arrays.deepToString(result));

        for (int i=0; i<=orgHeight-1; i++){
            for (int j=0; j<=orgWidth-1; j++){
                if (originalArr[i][j] == 0){
                        for (int j2=0; j2<=orgWidth-1; j2++){
                            result[i][j2] = 0;
                        }
                        for (int i2=0; i2<=orgHeight-1; i2++){
                            result[i2][j]=0;
                        }

                    }
                }
            }

            System.out.println(Arrays.deepToString(result));
            for (int i=0; i<=orgHeight-1; i++){
                for (int j=0; j<=orgWidth-1; j++){
                    if (result[i][j] == 0) {
                        originalArr[i][j] = 0;
                    }
                }
            }
        return originalArr;

    }

    public static int[][] transformer2(int[][] originalArr) {
        int height = originalArr.length;
        int width = originalArr[0].length;
        for (int i = 0; i < height; i++) {
            for (int j=0; j < width; j++) {
                if (originalArr[i][j] == 0) {
                    for (int j2=0; j2 < width; j2++) {
                        if (originalArr[i][j2] !=0){
                            originalArr[i][j2] = -1;
                        }
                    }
                    for (int i2=0; i2 < height; i2++) {
                        if (originalArr[i2][j] != 0){
                            originalArr[i2][j] = -1;
                        }
                    }
                }
                System.out.println(Arrays.deepToString(originalArr));
            }
        }
        System.out.println(Arrays.deepToString(originalArr));
        for(int i=0; i<=height-1; i++){
            for(int j=0; j<=width-1; j++){
                if (originalArr[i][j] == -1){
                    originalArr[i][j]=0;
                }
            }
        }
        return originalArr;
    }
    
    public static int[][] transformer3(int[][] originalArr){
        int height = originalArr.length;
        int width = originalArr[0].length;
        int[] isRowZero = new int [height];
        int[] isColumnZero = new int [width];

        for(int i=0; i < height; i++){
            for (int j=0; j <width; j++){
                if (originalArr[i][j] == 0) {
                    isRowZero[i]=-1;
                    isColumnZero[j]=-1;
                }
            }
        }

        for(int i=0; i < height; i++){
            for (int j=0; j <width; j++){
                if (isRowZero[i] == -1 || isColumnZero[j] == -1) {
                    originalArr[i][j] = 0;
                }
            }
        }
        return originalArr;
    }

}