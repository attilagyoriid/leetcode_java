package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void compute() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result = longestCommonPrefix.compute(new String[]{"flower", "flow", "fligth"});

        Assertions.assertThat(result).isEqualTo("fl");
    }
}