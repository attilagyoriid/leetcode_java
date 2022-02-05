package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSumZeroTest {

    @Test
    void calculate() {

        ThreeSumZero threeSumZero = new ThreeSumZero();
        List<List<Integer>> result = threeSumZero.calculate(new int[]{-1, 0, 1, 2, -1, -4});
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1, -1, 2));
        expected.add(Arrays.asList(-1, 0, 1));
        Assertions.assertThat(result).isEqualTo(expected);

    }
}