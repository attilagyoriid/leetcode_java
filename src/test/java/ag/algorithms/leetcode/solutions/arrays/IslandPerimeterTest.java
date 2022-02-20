package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IslandPerimeterTest {

    @Test
    void getPerimeter() {

        IslandPerimeter islandPerimeter = new IslandPerimeter();
        int[][] grid = new int[][] {{0,1,0,0}, {1,1,1,0}, {0,1,0,0},{1,1,0,0}};
        int result = islandPerimeter.getPerimeter(grid);
        Assertions.assertThat(result).isEqualTo(16);
    }
}