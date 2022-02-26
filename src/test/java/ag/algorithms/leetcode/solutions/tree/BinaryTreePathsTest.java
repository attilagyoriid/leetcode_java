package ag.algorithms.leetcode.solutions.tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreePathsTest {

    @Test
    void getPaths() {

        BinaryTreePaths binaryTreePaths = new BinaryTreePaths();
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

        Assertions.assertThat(binaryTreePaths.getPaths(root)).isEqualTo(List.of("-10->9->18", "-10->20->15", "-10->20->7"));
    }
}