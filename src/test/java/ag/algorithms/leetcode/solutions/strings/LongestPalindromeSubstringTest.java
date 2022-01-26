package ag.algorithms.leetcode.solutions.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeSubstringTest {

    @Test
    void compute() {

        LongestPalindromeSubstring longestPalindromeSubstring = new LongestPalindromeSubstring();
        Assertions.assertThat(longestPalindromeSubstring.compute("asdcarracg")).isEqualTo("carrac");
    }
}