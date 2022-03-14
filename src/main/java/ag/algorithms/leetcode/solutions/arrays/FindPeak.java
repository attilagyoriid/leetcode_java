package ag.algorithms.leetcode.solutions.arrays;

public class FindPeak {
    public int find(int[] list) {

        if (list == null || list.length < 1) {
            return 0;
        }

        int left = 0;
        int right = list.length - 1;
        while (left < right) {

            int mid = left + (right - left) / 2;

            if (list[mid] < list[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }

        return left;

    }
}
