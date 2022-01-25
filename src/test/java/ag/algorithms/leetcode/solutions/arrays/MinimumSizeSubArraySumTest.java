package ag.algorithms.leetcode.solutions.arrays;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;



class MinimumSizeSubArraySumTest {

    @Test
    void claculate() {
        MinimumSizeSubArraySum minimumSizeSubArraySum = new MinimumSizeSubArraySum();
        int result = minimumSizeSubArraySum.calculate(new int[]{1, 2, 2, 2, 1, 4, 0}, 5);
        Assertions.assertThat(result).isEqualTo(2);
    }
}