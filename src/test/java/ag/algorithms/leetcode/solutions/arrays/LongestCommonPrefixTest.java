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

    @Test
    void compute2() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result = longestCommonPrefix.compute(new String[]{"flower", "flowers", "flower"});

        Assertions.assertThat(result).isEqualTo("flower");
    }

    @Test
    void compute_no_common() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result = longestCommonPrefix.compute(new String[]{"xyz", "yz", "yzx"});

        Assertions.assertThat(result).isEqualTo("");
    }

    @Test
    void compute_empty_list() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result = longestCommonPrefix.compute(new String[]{""});

        Assertions.assertThat(result).isEqualTo("");
    }

    @Test
    void compute_null_list() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result = longestCommonPrefix.compute(null);

        Assertions.assertThat(result).isEqualTo("");
    }
}