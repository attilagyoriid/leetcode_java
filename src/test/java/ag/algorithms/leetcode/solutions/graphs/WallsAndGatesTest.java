package ag.algorithms.leetcode.solutions.graphs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class WallsAndGatesTest {

    @Test
    void calculateShortestDistanceToGatesDFS() {
        WallsAndGates wallsAndGates = new WallsAndGates();
        int[][] grid = new int[][]{{Integer.MAX_VALUE, -1, 0, Integer.MAX_VALUE}, {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -1},
                {Integer.MAX_VALUE, -1, Integer.MAX_VALUE, -1}, {0, -1, Integer.MAX_VALUE, Integer.MAX_VALUE}
        };
        int[][] expected = new int[][]{{3, -1, 0, 1}, {2, 2, 1, -1}, {1, -1, 2, -1}, {0, -1, 3, 4}};
        Assertions.assertThat(wallsAndGates.calculateShortestDistanceToGatesDFS(grid)).isEqualTo(expected);

    }


}