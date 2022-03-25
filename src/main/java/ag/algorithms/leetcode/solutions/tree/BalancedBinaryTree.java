package ag.algorithms.leetcode.solutions.tree;

import java.util.List;

public class BalancedBinaryTree {

    public boolean isBalanced(Node root) {
        if (root == null || (root.leftNode == null && root.rightNode == null)) {
            return true;
        }

        return dfs(root).get(0) == 1;
    }

    private List<Integer> dfs(Node root) {
        if (root == null) {
            // 1st: balanced:1, unbalanced:0
            // 2nd: height of the tree
            return List.of(1,0);
        }
        List<Integer> left = dfs(root.leftNode);
        List<Integer> right = dfs(root.rightNode);
        Integer balanced = left.get(0) == 1 && right.get(0) == 1 && Math.abs(left.get(1) - right.get(1)) <= 1 ? 1:0;



        return List.of(balanced, 1 + Math.max(left.get(1), right.get(1)));
    }
}
