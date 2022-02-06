package ag.algorithms.leetcode.solutions.numbers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {

    @Test
    void calculate() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        Assertions.assertThat(climbingStairs.calculate(5) ).isEqualTo(8);
    }
}