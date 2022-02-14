package ag.algorithms.leetcode.solutions.arrays;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public int calculate(int[] list) {
        if (list == null || list.length < 1) {
            return 0;
        }
        int[] result = new int[list.length];
        Arrays.fill(result, 1);

        for (int i = list.length - 1; i > -1; i--) {

            for (int j = i + 1; j < list.length; j++) {
                if (list[i] < list[j]) {
                    result[i] = Math.max( result[i], 1 + result[j]);
                }

            }

        }

        return Arrays.stream(result).max().orElse(0);


    }
}
