package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CombinationPhoneNumbersTest {

    private CombinationPhoneNumbers combinationPhoneNumbers;

    @BeforeEach
    public void setUp() {
        combinationPhoneNumbers = new CombinationPhoneNumbers();
    }

    @Test
    void combine() {
        Assertions.assertThat(combinationPhoneNumbers.combine("23")).isEqualTo(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));
    }

    @Test
    void combineRecursive() {
        Assertions.assertThat(combinationPhoneNumbers.combineRecursive("23")).isEqualTo(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"));

    }
}