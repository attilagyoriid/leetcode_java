package ag.algorithms.leetcode.solutions.tree;

public class SymmetricTree {

    public boolean isSymmetric(Node root) {

        if (root == null) {
            return true;
        }

        return recursiveSymmetricCheck(root.rightNode, root.leftNode);

    }

    private boolean recursiveSymmetricCheck(Node right, Node left) {

        if (right == null || left == null) {
            return left == right;
        }
        if (right.value != left.value) {
            return false;
        }

        return recursiveSymmetricCheck(left.leftNode, right.rightNode) && recursiveSymmetricCheck(left.rightNode, right.leftNode);


    }
}
