package ag.algorithms.leetcode.solutions.tree;

import ag.algorithms.leetcode.solutions.BinaryTree.Tree;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumLeftLeavesTest {

    @Test
    void sum() {
        Tree intTree = new Tree();
        intTree.insert(40);
        intTree.insert(31);
        intTree.insert(45);
        intTree.insert(19);
        intTree.insert(35);
        intTree.insert(42);
        intTree.insert(46);
        intTree.insert(47);
        SumLeftLeaves sumLeftLeaves = new SumLeftLeaves();
        Assertions.assertThat(sumLeftLeaves.sum(intTree.getRoot())).isEqualTo(61);
    }
}