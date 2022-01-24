package ag.algorithms.leetcode.solutions.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxContSubArrayTest {

    @Test
    void calculate() {

        int[] list = {1, 2, -4, 4, -2, 3,-1,-2};

        MaxContSubArray maxContSubArray = new MaxContSubArray();
        int calculate = maxContSubArray.calculate(list);
        System.out.println(calculate);
    }
}