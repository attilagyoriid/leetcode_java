package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DuplicatesInArrayTest {
    private DuplicatesInArray duplicatesInArray;
    @BeforeEach
    void setUp() {
        duplicatesInArray = new DuplicatesInArray();
    }

    @Test
    void containsDuplicateHappy() {
        final int[] nums = {1, 2, 3, 4, 2, 1};
        Assertions.assertThat(duplicatesInArray.containsDuplicate(nums)).isTrue();

    }

    @Test
    void containsDuplicateEmptyArray() {
        final int[] nums = {};
        Assertions.assertThat(duplicatesInArray.containsDuplicate(nums)).isFalse();

    }

    @Test
    void containsDuplicateOneItemArray() {
        final int[] nums = {2};
        Assertions.assertThat(duplicatesInArray.containsDuplicate(nums)).isFalse();

    }

    @Test
    void containsDuplicateFailure() {
        final int[] nums = {1, 2, 3, 4};
        Assertions.assertThat(duplicatesInArray.containsDuplicate(nums)).isFalse();

    }

    @Test
    void floydsCycleDetection() {

        final int[] nums = {1, 2, 3, 4 ,5, 2, 1};
        System.out.println(duplicatesInArray.floydsCycleDetection(nums));
    }
}