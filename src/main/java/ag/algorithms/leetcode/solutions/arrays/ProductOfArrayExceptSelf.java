package ag.algorithms.leetcode.solutions.arrays;

public class ProductOfArrayExceptSelf {

    public int[] calculate(int[] items) {
        int[] result = new int[items.length];
        int prefix = 1;

        for (int i = 0; i < items.length; i++) {

            result[i] = prefix;
            prefix *=items[i];

        }
        int postfix = 1;
        for (int i = items.length-1; i > -1; i--) {

            result[i] *= postfix;
            postfix *= items[i];

        }


        return result;

    }
}
