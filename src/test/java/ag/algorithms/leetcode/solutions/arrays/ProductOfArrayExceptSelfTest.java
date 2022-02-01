package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductOfArrayExceptSelfTest {

    @Test
    void calculate() {

        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] result = productOfArrayExceptSelf.calculate(new int[]{1, 2, 3, 4});
        Assertions.assertThat(result).isEqualTo(new int[]{24, 12, 8, 6});

    }
}