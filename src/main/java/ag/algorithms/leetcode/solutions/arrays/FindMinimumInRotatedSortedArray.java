package ag.algorithms.leetcode.solutions.arrays;

public class FindMinimumInRotatedSortedArray {

    public int calculate(int[] items) {

        int result = items[0];
        int right = items.length - 1;
        int left = 0;
        int middle;

        while (left <= right) {
            if (items[left] < items[right]) {
                return Math.min(result, items[left]);
            }

            middle = (left + result) / 2;
            result = Math.min(result, middle);

            if (items[left] <= items[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return result;

    }

}
