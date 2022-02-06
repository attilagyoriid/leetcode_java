package ag.algorithms.leetcode.solutions.arrays;

public class MissingNumber {

    public int calculate(int[] items) {
        int result = items.length;

        for (int i = 0; i < items.length; i++) {
            result += (i - items[i]);
        }

        return result;
    }
}
