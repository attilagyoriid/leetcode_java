package ag.algorithms.leetcode.solutions.arrays;

public class JumpGame {

    public boolean canReachLastIndex(int[] list) {

        int goal = list.length - 1;

        for (int i = list.length - 1; i > -1; i--) {

            if (i + list[i] >= goal) {
                goal = i;
            }

        }

        return goal == 0;

    }

}
