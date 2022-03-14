package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FindPeakTest {

    @Test
    void find() {

        int[] list = new int[]{1, 2, 1, 3, 5, 6, 4};

        Assertions.assertThat(new FindPeak().find(list)).isEqualTo(5);

    }
}