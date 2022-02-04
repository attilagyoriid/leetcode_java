package ag.algorithms.leetcode.solutions.arrays;

public class SearchInRotatedSortedArray {

    public int calculate(int[] items, int toSearchFor) {

        int left = 0;
        int right = items.length - 1;
        int middle;

        while (left <= right) {
            middle = (right + left) / 2;
            if (items[middle] == toSearchFor) {
                return middle;
            }

            if (items[left] <= items[middle]) {

                if (items[middle] < toSearchFor || toSearchFor < items[left]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            } else {
                if (items[middle] > toSearchFor || toSearchFor > items[right]) {
                    right = middle - 1;

                } else {
                    left = middle + 1;

                }

            }


        }
        return -1;
    }
}
