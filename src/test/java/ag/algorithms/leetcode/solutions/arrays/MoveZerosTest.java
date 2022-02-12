package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MoveZerosTest {

    @Test
    void moveZeros() {

        MoveZeros moveZeros = new MoveZeros();
        Assertions.assertThat(moveZeros.moveZeros(new int[]{0, 4, 1, 0, 2, 0})).isEqualTo(new int[]{4, 1, 2, 0, 0, 0});

    }
}