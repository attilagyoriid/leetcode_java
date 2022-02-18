package ag.algorithms.leetcode.solutions.tree;

import ag.algorithms.leetcode.solutions.BinaryTree.Tree;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeMaximumPathSumTest {

    @Test
    void getMaxPathSum() {
        Node root = new Node(-10);
        root.leftNode = new Node(9);
        Node right1 = new Node(20);
        root.rightNode = right1;
        Node left2 = new Node(15);
        Node right2 = new Node(7);
        right1.leftNode = left2;
        right1.rightNode = right2;
        BinaryTreeMaximumPathSum binaryTreeMaximumPathSum = new BinaryTreeMaximumPathSum();
        int result = binaryTreeMaximumPathSum.getMaxPathSum(root);
        Assertions.assertThat(result).isEqualTo(42);
        System.out.println();
    }
}