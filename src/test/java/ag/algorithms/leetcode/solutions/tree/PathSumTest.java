package ag.algorithms.leetcode.solutions.tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;



class PathSumTest {

    @Test
    void hasPathSum() {
        Node root = new Node(-10);
        root.leftNode = new Node(9);
        Node right1 = new Node(20);
        root.rightNode = right1;
        Node left2 = new Node(15);
        Node right2 = new Node(7);
        right1.leftNode = left2;
        right1.rightNode = right2;

        PathSum pathSum = new PathSum();

        Assertions.assertThat(pathSum.hasPathSum(root,17)).isTrue();
    }
}