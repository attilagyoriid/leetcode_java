package ag.algorithms.leetcode.solutions.tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {

    @Test
    void isSame() {
        Node rootA = new Node(-10);
        rootA.leftNode = new Node(9);
        Node rightA1 = new Node(20);
        rootA.rightNode = rightA1;
        Node leftA2 = new Node(15);
        Node rightA2 = new Node(7);
        rightA1.leftNode = leftA2;
        rightA1.rightNode = rightA2;

        Node root = new Node(-10);
        root.leftNode = new Node(9);
        Node right1 = new Node(20);
        root.rightNode = right1;
        Node left2 = new Node(15);
        Node right2 = new Node(7);
        right1.leftNode = left2;
        right1.rightNode = right2;


        SameTree sameTree = new SameTree();
        Assertions.assertThat(sameTree.isSame(rootA,root)).isTrue();

    }

    @Test
    void isSame_failure1() {
        Node rootA = new Node(-10);
        rootA.leftNode = new Node(9);
        Node rightA1 = new Node(20);
        rootA.rightNode = rightA1;
        Node leftA2 = new Node(15);
        Node rightA2 = new Node(7);
        rightA1.leftNode = leftA2;
        rightA1.rightNode = rightA2;

        Node root = new Node(-10);
        root.leftNode = new Node(9);
        Node right1 = new Node(20);
        root.rightNode = right1;
        Node left2 = new Node(16);
        Node right2 = new Node(7);
        right1.leftNode = left2;
        right1.rightNode = right2;


        SameTree sameTree = new SameTree();
        Assertions.assertThat(sameTree.isSame(rootA,root)).isFalse();

    }

    @Test
    void isSame_failure2() {
        Node rootA = new Node(-10);
        rootA.leftNode = new Node(9);
        Node rightA1 = new Node(20);
        rootA.rightNode = rightA1;
        rightA1.leftNode = new Node(15);


        Node root = new Node(-10);
        root.leftNode = new Node(9);
        Node right1 = new Node(20);
        root.rightNode = right1;
        Node left2 = new Node(15);
        Node right2 = new Node(7);
        right1.leftNode = left2;
        right1.rightNode = right2;


        SameTree sameTree = new SameTree();
        Assertions.assertThat(sameTree.isSame(rootA,root)).isFalse();

    }
}