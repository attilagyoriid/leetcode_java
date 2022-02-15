package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class LongestCommonSubsequenceTest {

    @Test
    void calculate() {
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        Assertions.assertThat(longestCommonSubsequence.calculate("abcde","ace")).isEqualTo(3);
    }
}