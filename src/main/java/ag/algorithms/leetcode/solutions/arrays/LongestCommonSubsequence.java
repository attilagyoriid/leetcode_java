package ag.algorithms.leetcode.solutions.arrays;

import java.util.Arrays;

public class LongestCommonSubsequence {

    public int calculate(String text1, String text2) {
        int[][] matrix = new int[text1.length()+1][text2.length()+1];
        for (int[] row : matrix) {
            Arrays.fill(row, 0);
        }
        for (int i = text1.length() - 1; i > -1; i--) {
            for (int j = text2.length() - 1; j > -1; j--) {

                if (text1.charAt(i) == text1.charAt(j)) {
                    matrix[i][j] = 1 + matrix[i + 1][j + 1];
                } else {
                    matrix[i][j] = Math.max(matrix[i + 1][j], matrix[i][j + 1]);
                }

            }
        }
        return matrix[0][0];
    }
}
