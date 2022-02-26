package ag.algorithms.leetcode.solutions.tree;

import ag.algorithms.leetcode.solutions.BinaryTree.TreeNode;

public class InvertBinaryTree {

    public TreeNode invert(TreeNode root) {

        if (root == null) {
            return null;
        }

        TreeNode temp = root.getLeftChild();
        root.setLeftChild(root.getRightChild());
        root.setRightChild(temp);

        invert(root.getLeftChild());
        invert(root.getRightChild());

        return root;

    }
}
