package ag.algorithms.leetcode.solutions.tree;

public class PathSum {

    public boolean hasPathSum(Node root, int targetSum) {

        return dfs(root, targetSum, 0);

    }

    private boolean dfs(Node root, int targetSum, int currentSum) {
        if (root == null) {
            return false;
        }
        currentSum += root.value;
        if (root.leftNode == null && root.rightNode == null) {
            return currentSum == targetSum;
        }
        return dfs(root.leftNode, targetSum, currentSum) || dfs(root.rightNode, targetSum, currentSum);
    }

}
