package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class CombinationSumTest {

    @Test
    void getUniqueCombination() {

        CombinationSum combinationSum = new CombinationSum();


        Assertions.assertThat(combinationSum.getUniqueCombination(List.of(2, 3, 6, 7), 7)).isEqualTo(List.of(List.of(2, 2, 3), List.of(7)));
    }
}