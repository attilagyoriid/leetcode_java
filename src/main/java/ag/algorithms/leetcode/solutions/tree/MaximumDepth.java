package ag.algorithms.leetcode.solutions.tree;

public class MaximumDepth {

    public int maxDepth(Node root) {

        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.leftNode);
        int right = maxDepth(root.rightNode);

        return Math.max(left,right) + 1;

    }
}
