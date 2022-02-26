package ag.algorithms.leetcode.solutions.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {

    public List<Integer> getRightSideView(Node root) {

        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> levels = new LinkedList<>();
        levels.add(root);

        while (!levels.isEmpty()) {

            int size = levels.size();
            for (int i = 0; i < size; i++) {

                Node currentNode = levels.remove();
                if (i == size - 1) {
                    result.add(currentNode.value);
                }
                if (currentNode.leftNode != null) {
                    levels.add(currentNode.leftNode);
                }

                if (currentNode.rightNode != null) {
                    levels.add(currentNode.rightNode);
                }
            }

        }

        return result;

    }
}
