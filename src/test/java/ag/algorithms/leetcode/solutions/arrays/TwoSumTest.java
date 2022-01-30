package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void compute() {

        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.compute(new int[]{7, 2, 11, 15}, 9);
        Assertions.assertThat(result).isEqualTo(new int[]{0,1});
    }
}