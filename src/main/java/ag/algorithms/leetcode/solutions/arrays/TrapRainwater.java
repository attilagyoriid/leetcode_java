package ag.algorithms.leetcode.solutions.arrays;

public class TrapRainwater {

    public int getTrappedRainwaterAmount(int[] list) {
        var leftMax = list[0];
        var rightMax = list[list.length - 1];
        var left = 0;
        var right = list.length - 1;
        var result = 0;

        while (left < right) {

            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, list[left]);
                result += leftMax - list[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, list[right]);
                result += rightMax - list[right];
            }

        }
        return result;

    }

}
