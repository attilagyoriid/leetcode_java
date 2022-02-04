package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInRotatedSortedArrayTest {

    @Test
    void calculate() {
        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        int result = searchInRotatedSortedArray.calculate(new int[]{4, 5, 6, 7, 0, 1, 2}, 0);
        Assertions.assertThat(result).isEqualTo(4);
    }
}