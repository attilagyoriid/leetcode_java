package ag.algorithms.leetcode.solutions.tree;

public class ConvertSortedArray2BinarySearchTree {

    public Node convert(int[] list) {
        if (list == null || list.length == 0) {
            return null;
        }

        return convertToTree(list, 0, list.length - 1);
    }

    private Node convertToTree(int[] list, int left, int right) {

        if (left > right) {
            return null;
        }

        int middle = left + (right - left) / 2;
        Node root = new Node(list[middle]);
        root.leftNode = convertToTree(list, left, middle - 1);
        root.rightNode = convertToTree(list, middle + 1, right);
        return root;
    }
}
