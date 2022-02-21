package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateArrayTest {

    @Test
    void rotate() {
        int[] list = {1, 2, 3, 4, 5};
        int k = 2;
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(list, k);
        Assertions.assertThat(list).isEqualTo(new int[]{4, 5, 1, 2, 3});
    }

    @Test
    void rotateInPlace() {
        int[] list = {1, 2, 3, 4, 5};
        int k = 2;
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotateInPlace(list, k);
        Assertions.assertThat(list).isEqualTo(new int[]{4, 5, 1, 2, 3});


    }
}