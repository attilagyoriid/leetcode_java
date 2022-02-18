package ag.algorithms.leetcode.solutions.tree;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
    public List<List<Integer>> getPaths(Node root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        findPath(root, sum, new ArrayList<>(),result);
        return result;
    }

    private void findPath(Node root, int sum, ArrayList<Integer> currentPaths, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        currentPaths.add(root.value);
        if (root.value == sum && root.leftNode == null && root.rightNode == null) {
            result.add(currentPaths);
        }
        findPath(root.leftNode,sum-root.value,new ArrayList<>(currentPaths),result);
        findPath(root.rightNode,sum-root.value,new ArrayList<>(currentPaths),result);
    }


}
