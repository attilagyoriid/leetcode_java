package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestIncreasingSubsequenceTest {

    @Test
    void calculate() {

        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
        Assertions.assertThat(longestIncreasingSubsequence.calculate(new int[]{10, 9, 2, 5, 3, 7, 101, 18})).isEqualTo(4);
    }
}