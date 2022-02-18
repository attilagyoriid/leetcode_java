package ag.algorithms.leetcode.solutions.tree;



public class BinaryTreeMaximumPathSum {
    int result = Integer.MIN_VALUE;
    public int getMaxPathSum(Node root) {

        dfs(root);
        return result;
    }

    private int dfs(Node root) {
        if (root == null) {
            return 0;
        }
        int leftMax = dfs(root.leftNode);
        int rightMax = dfs(root.rightNode);
        leftMax = Math.max(leftMax, 0);
        rightMax = Math.max(rightMax, 0);
//        compute with split
        result = Math.max(result, root.value + leftMax + rightMax);
        return root.value + Math.max(leftMax, rightMax);
    }
}
