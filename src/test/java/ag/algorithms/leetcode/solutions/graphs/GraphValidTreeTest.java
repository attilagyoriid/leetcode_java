package ag.algorithms.leetcode.solutions.graphs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class GraphValidTreeTest {

    @Test
    void isValid() {

        GraphValidTree graphValidTree = new GraphValidTree();

        int[][] edges = new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 4}};
        int nodeNumber = 5;

        Assertions.assertThat(graphValidTree.isValid(edges,nodeNumber)).isTrue();
    }
}