package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestConsecutiveSequenceTest {

    @Test
    void compute() {

        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        Assertions.assertThat(longestConsecutiveSequence.compute(new int[]{100, 4, 200, 1, 3, 2})).isEqualTo(4);

    }
}