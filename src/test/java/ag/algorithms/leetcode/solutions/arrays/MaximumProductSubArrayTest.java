package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProductSubArrayTest {

    @Test
    void compute() {
        MaximumProductSubArray maximumProductSubArray = new MaximumProductSubArray();
        int result = maximumProductSubArray.compute(new int[]{-1, -2, -3, -4, -5});
        Assertions.assertThat(result).isEqualTo(120);
    }

    @Test
    void compute_with_zero() {
        MaximumProductSubArray maximumProductSubArray = new MaximumProductSubArray();
        int result = maximumProductSubArray.compute(new int[]{-1, -2, 0, -3, -4, -5});
        Assertions.assertThat(result).isEqualTo(20);
    }

    @Test
    void compute_with_zero_end() {
        MaximumProductSubArray maximumProductSubArray = new MaximumProductSubArray();
        int result = maximumProductSubArray.compute(new int[]{-1, -2, -3, -4, -5, 0});
        Assertions.assertThat(result).isEqualTo(120);
    }
}