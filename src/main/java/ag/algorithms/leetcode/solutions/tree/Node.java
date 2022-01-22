package ag.algorithms.leetcode.solutions.tree;

public class Node {
    public int value;
    public Node rightNode;
    public Node leftNode;

    public Node(int value, Node leftNode, Node rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public Node(int value) {
        this(value, null, null);
    }
}
