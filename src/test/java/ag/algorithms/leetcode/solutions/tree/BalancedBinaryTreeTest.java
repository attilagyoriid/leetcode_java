package ag.algorithms.leetcode.solutions.tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBinaryTreeTest {

    @Test
    void isBalanced() {
        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

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
        Assertions.assertThat(balancedBinaryTree.isBalanced(root)).isTrue();
    }

    @Test
    void isNotBalanced() {
        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

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
        Node left3 = new Node(5);
        left3.leftNode = new Node(6);
        left2.leftNode = left3;
        Assertions.assertThat(balancedBinaryTree.isBalanced(root)).isFalse();
    }
}