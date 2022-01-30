package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class ContainerWithMostWaterTest {

    @Test
    void calculate() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int result = containerWithMostWater.calculate(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        Assertions.assertThat(result).isEqualTo(49);
    }
}