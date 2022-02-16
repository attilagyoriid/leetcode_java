package ag.algorithms.leetcode.solutions.tree;

import ag.algorithms.leetcode.solutions.BinaryTree.TreeNode;

public class SumLeftLeaves {


    public int sum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.getLeftChild() != null && root.getLeftChild().getLeftChild() == null && root.getLeftChild().getRightChild() == null) {
            return root.getLeftChild().getData() + sum(root.getRightChild());
        } else {
            return sum(root.getLeftChild()) + sum(root.getRightChild());
        }


    }
}
