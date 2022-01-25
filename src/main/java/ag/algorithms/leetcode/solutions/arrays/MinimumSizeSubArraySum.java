package ag.algorithms.leetcode.solutions.arrays;

public class MinimumSizeSubArraySum {

    public int calculate(int[] list, int sum) {

//        [1, 2, 2, 2, 1, 4, 0] looking to sum up to 5
        int localSum = 0;
        int left = 0;
        int size = Integer.MAX_VALUE;

        for (int i = 0; i < list.length; i++) {

            localSum += list[i];

            while (localSum >= sum) {
                size = Math.min(i + 1 - left, size);
                localSum -= list[left++];

            }


        }

        return size < Integer.MAX_VALUE ? size : 0;
    }
}
