package ag.algorithms.leetcode.solutions.arrays;

public class MaxContSubArray {

    public int calculate(int[] list) {

        int localMax = Integer.MIN_VALUE;
        int globalMax = Integer.MIN_VALUE;

        for (int j : list) {

            localMax = Math.max(j, j + localMax);
            globalMax = Math.max(localMax, globalMax);

        }

        return globalMax;


    }
}
