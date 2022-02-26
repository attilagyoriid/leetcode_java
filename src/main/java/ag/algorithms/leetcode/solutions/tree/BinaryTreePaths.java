package ag.algorithms.leetcode.solutions.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    public List<String> getPaths (Node root) {

        List<String> paths = new ArrayList<>();
        if (root == null) {
            return paths;
        }
        dfs(root, paths, "");
        return  paths;
    }

    private void dfs(Node root, List<String> paths, String path) {
        path += root.value;
        if (root.leftNode==null && root.rightNode == null) {
            paths.add(path);
            return;
        }
        if (root.leftNode != null) {
            dfs(root.leftNode,paths, path + "->");
        }
        if (root.rightNode != null) {
            dfs(root.rightNode,paths, path + "->");
        }
    }

}
