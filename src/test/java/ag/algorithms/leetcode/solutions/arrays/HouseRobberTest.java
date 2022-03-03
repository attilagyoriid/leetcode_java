package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class HouseRobberTest {

    @Test
    void robHouse() {

        HouseRobber houseRobber = new HouseRobber();
        Assertions.assertThat(houseRobber.robHouse(new int[]{1, 2, 3, 1})).isEqualTo(4);
    }
}