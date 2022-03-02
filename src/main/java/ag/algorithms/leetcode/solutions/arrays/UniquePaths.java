package ag.algorithms.leetcode.solutions.arrays;

import java.util.Arrays;

public class UniquePaths {

    public int getNumberOfUniquePath(int m, int n) {

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i][0] = 1; //each row in the first column
        }
        //each column in the first row
        Arrays.fill(matrix[0], 1);
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
            }
        }

        return matrix[m - 1][n - 1];

    }
}
