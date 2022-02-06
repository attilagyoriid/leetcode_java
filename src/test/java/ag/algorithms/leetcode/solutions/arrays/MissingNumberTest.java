package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    @Test
    void calculate() {

        MissingNumber missingNumber = new MissingNumber();
        Assertions.assertThat(missingNumber.calculate(new int[]{0,1,3})).isEqualTo(2);
    }
}