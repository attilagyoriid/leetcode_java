package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TrapRainwaterTest {

    @Test
    void getTrappedRainwaterAmount() {

        TrapRainwater trapRainwater = new TrapRainwater();
        Assertions.assertThat(trapRainwater.getTrappedRainwaterAmount(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1})).isEqualTo(6);
    }
}