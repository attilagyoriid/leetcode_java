package ag.algorithms.leetcode.solutions.tree;

public class SameTree {

    public boolean isSame(Node rootA, Node rootB) {

        if (rootA == null && rootB == null) {
            return true;
        }
        if ((rootA == null || rootB == null) || rootA.value != rootB.value) {
            return false;
        }

        return isSame(rootA.leftNode, rootB.leftNode) && isSame(rootA.rightNode, rootB.rightNode);


    }
}
