package ag.algorithms.leetcode.solutions.tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BreathFirstTraversalTest {

    @Test
    void traverse() {
        Node nodeLeft35 = new Node(79);
        Node nodeRight36 = new Node(81);
        Node nodeLeft21 = new Node(43, nodeLeft35, nodeRight36);
        Node nodeRight38 = new Node(73);
        Node nodeLeft37 = new Node(75);
        Node nodeRight22 = new Node(41, nodeLeft37, nodeRight38);
        Node nodeLeft1 = new Node(14, nodeLeft21, nodeRight22);
        Node nodeLeft31 = new Node(54);
        Node nodeRight32 = new Node(72);
        Node nodeLeft23 = new Node(23, nodeLeft31, nodeRight32);
        Node nodeLeft33 = new Node(66);
        Node nodeRight34 = new Node(67);
        Node nodeRight24 = new Node(23, nodeLeft33, nodeRight34);
        Node nodeRight1 = new Node(19, nodeLeft23, nodeRight24);
        Node root = new Node(12, nodeLeft1, nodeRight1);

        List<List<Integer>> traverse = new BreathFirstTraversal().traverse(root);

        List<List<Integer>> expectedList = new ArrayList<>();
        expectedList.add(List.of(12));
        expectedList.add(List.of(14, 19));
        expectedList.add(List.of(43, 41, 23, 23));
        expectedList.add(List.of(79, 81, 75, 73, 54, 72, 66, 67));

        Assertions.assertThat(new BreathFirstTraversal().traverse(root)).isEqualTo(expectedList);

        System.out.println(traverse);
    }
}