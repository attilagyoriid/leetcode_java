package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsTest {

    @Test
    void compute_1_island() {
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        char[][] area = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'},

        };
        Assertions.assertThat(numberOfIslands.compute(area)).isEqualTo(1);

    }

    @Test
    void compute_3_island() {
        NumberOfIslands numberOfIslands = new NumberOfIslands();
        char[][] area = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'},

        };
        Assertions.assertThat(numberOfIslands.compute(area)).isEqualTo(3);

    }
}