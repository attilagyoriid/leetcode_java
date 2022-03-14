package ag.algorithms.leetcode.solutions.numbers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    @Test
    void isHappy() {

        HappyNumber happyNumber = new HappyNumber();

        Assertions.assertThat(happyNumber.isHappy(19)).isTrue();
    }
}