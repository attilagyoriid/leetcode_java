package ag.algorithms.leetcode.solutions.tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {

    @Test
    void isSymmetric() {

        Node root = new Node(1);
        Node left1 = new Node(2);
        left1.leftNode = new Node(3);
        left1.rightNode = new Node(4);
        root.leftNode = left1;
        Node right1 = new Node(2);
        right1.leftNode = new Node(4);
        right1.rightNode = new Node(3);
        root.rightNode = right1;

        SymmetricTree symmetricTree = new SymmetricTree();
        Assertions.assertThat(symmetricTree.isSymmetric(root)).isTrue();


    }
}