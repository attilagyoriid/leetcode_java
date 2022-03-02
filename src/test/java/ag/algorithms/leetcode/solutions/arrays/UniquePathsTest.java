package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class UniquePathsTest {

    @Test
    void getNumberOfUniquePath() {

        UniquePaths uniquePaths = new UniquePaths();
        Assertions.assertThat(uniquePaths.getNumberOfUniquePath(7, 3)).isEqualTo(28);
    }
}