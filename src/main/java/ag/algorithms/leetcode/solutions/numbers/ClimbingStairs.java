package ag.algorithms.leetcode.solutions.numbers;

public class ClimbingStairs {

    public int calculate(int top) {
        int one = 1;
        int two = 1;
        int temp;
        for (int i = 0; i < top - 1; i++) {
            temp = one;
            one = one + two;
            two = temp;

        }
        return one;
    }

}
