package ag.algorithms.leetcode.solutions.tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PathSum2Test {

    @Test
    void getPaths() {
        Node root = new Node(-10);
        Node leftNode1 = new Node(9);
        root.leftNode = leftNode1;
        leftNode1.leftNode = new Node(18);
        Node right1 = new Node(20);
        root.rightNode = right1;
        Node left2 = new Node(15);
        Node right2 = new Node(7);
        right1.leftNode = left2;
        right1.rightNode = right2;

        PathSum2 pathSum2 = new PathSum2();
        List<List<Integer>> result = pathSum2.getPaths(root, 17);

        Assertions.assertThat(result).isEqualTo(List.of(Arrays.asList(-10, 9, 18), Arrays.asList(-10, 20, 7)));
    }
}