package ag.algorithms.leetcode.solutions.arrays;

public class ContainerWithMostWater {
    public int calculate(int[] container) {
        int left = 0;
        int right = container.length - 1;
        int max = Integer.MIN_VALUE;
        while (left < right) {

            int min = Math.min(container[left], container[right]);
            max = Math.max(max, min*(right-left));
            if (container[left] < container[right]) {
                left++;
            } else {
                right--;
            }

        }

        return max;

    }
}
