package ag.algorithms.leetcode.solutions.arrays;

import java.util.Arrays;

public class MaximumProductSubArray {


    private static int getAsInt() {
        return 0;
    }

    public int compute(int[] items) {

        int maximum = 1;
        int minimum = 1;

        int result = Arrays.stream(items).max().orElseGet(MaximumProductSubArray::getAsInt);
        int tempMax;
        for (int item : items) {

            if (item == 0) {
                maximum = 1;
                minimum = 1;
                continue;
            }

            tempMax = maximum * item;
            maximum = Math.max(Math.max(tempMax, minimum * item), item);
            minimum = Math.min(Math.min(tempMax, minimum * item), item);
            result = Math.max(maximum, result);

        }
        return result;
    }
}
