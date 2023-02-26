package chapter02_parttenFinding.practice;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
    // int[][] matrix = new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
    // [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
    int[][] matrix = new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
    // [[1,2,3],[4,5,6],[7,8,9]]
    // int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    rotate(matrix);
    }
    public static void rotate(int[][] matrix) {
        for(int[] tem: matrix){
            System.out.println(Arrays.toString(tem));
        }
        int n = matrix.length;
        for (int i=0; i<n/2; i++){
            for (int j=i; j < n-i-1; j++){
                // [0][0] -> [0][2]
                // [0][1] -> [1][2]
                // [i][j] -> [j][n-i-1] (on this side, [i][j] can only be [0][0] or [0][1], that is the start point)

                // [0][2] -> [2][2]
                // [1][2] -> [2][1]
                // [j][n-i-1] -> [n-i-1][n-j-1] (on this side, [i][j] can only be [0][0] or [0][1], that is the start point)

                // [2][2] -> [2][0]
                // [2][1] -> [1][0]
                // [n-i-1][n-j-1] -> [n-j-1][i]

                // [2][0] -> [0][0]
                // [1][0] -> [0][1]
                // [n-j-1][i] -> [i][j]

                int temp_i_j = matrix[i][j];
                //[0][0] = [2][0]
                //[0][1] = [1][0]
                matrix[i][j] = matrix[n-j-1][i];

                matrix[n-j-1][i] =  matrix[n-i-1][n-j-1];
                // [2][0] = [2][2]
                // [1][0] = [2][1]

                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                // [2][2] = [0][2]
                // [2][1] = [1][2]

                matrix[j][n-i-1] = temp_i_j;

                // int temp_j__n_i_1 = matrix[j][n-i-1];
                // matrix[j][n-i-1] = temp_i_j;
                // // [0][2] = [0][0]
                // // [1][2] = [0][1]

                // int temp_n_i_1_n_j_1 = matrix[n-i-1][n-j-1];
                // matrix[n-i-1][n-j-1] = temp_j__n_i_1;
                // // [2][2] = [0][2]
                // // [2][1] = [1][2]

                // matrix[n-j-1][i] =  temp_n_i_1_n_j_1;
                // // [2][0] = [2][2]
                // // [1][0] = [2][1]


            }
        }
        System.out.println();

        for(int[] tem: matrix){
            System.out.println(Arrays.toString(tem));
        }
    }
    
}