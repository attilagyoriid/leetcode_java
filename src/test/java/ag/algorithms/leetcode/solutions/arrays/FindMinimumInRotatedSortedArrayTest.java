package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMinimumInRotatedSortedArrayTest {

    @Test
    void calculate() {

        FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new FindMinimumInRotatedSortedArray();
        Assertions.assertThat(findMinimumInRotatedSortedArray.calculate(new int[]{
                3, 4, 5, 1, 2
        })).isEqualTo(1);
    }
}