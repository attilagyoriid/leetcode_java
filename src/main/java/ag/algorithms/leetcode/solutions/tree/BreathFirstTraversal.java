package ag.algorithms.leetcode.solutions.tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BreathFirstTraversal {

    public List<List<Integer>> traverse(Node root) {

        List<List<Integer>> result = new ArrayList<>();
        Deque<Node> queue = new LinkedList<>();
        queue.add(root);

        while (queue.size() > 0) {

            List<Integer> levels = new ArrayList<>();

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node currentNode = queue.pop();

                if (currentNode != null) {
                    levels.add(currentNode.value);
                    queue.add(currentNode.leftNode);
                    queue.add(currentNode.rightNode);
                }
            }
            if (levels.size() > 0)
                result.add(levels);

        }
        return result;
    }
}
