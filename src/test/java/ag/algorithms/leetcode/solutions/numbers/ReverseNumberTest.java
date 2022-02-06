package ag.algorithms.leetcode.solutions.numbers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNumberTest {

    @Test
    void calculate() {
        ReverseNumber reverseNumber = new ReverseNumber();
        Assertions.assertThat(reverseNumber.calculate(1234)).isEqualTo(4321);
    }
}