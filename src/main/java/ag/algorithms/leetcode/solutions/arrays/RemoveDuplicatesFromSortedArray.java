package ag.algorithms.leetcode.solutions.arrays;

public class RemoveDuplicatesFromSortedArray {

    public int compute(int[] items) {
        int left = 1;

        for (int right = 1; right < items.length; right++) {

            if (items[right] != items[right-1]) {
                items[left++] = items[right];
            }

        }

        return left;
    }
}
