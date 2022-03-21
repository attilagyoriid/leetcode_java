package ag.algorithms.leetcode.solutions.tree;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class ConvertSortedArray2BinarySearchTreeTest {

    @Test
    void convert() {

        ConvertSortedArray2BinarySearchTree convertSortedArray2BinarySearchTree = new ConvertSortedArray2BinarySearchTree();

        int[] list = {-10, -3, 0, 5, 9};
        Node result = convertSortedArray2BinarySearchTree.convert(list);


        Assertions.assertThat(list).isEqualTo(inorder2arr(result, new ArrayList<>()).stream().mapToInt(i -> i).toArray());

    }

    private ArrayList<Integer> inorder2arr(Node node, ArrayList<Integer> arr)
    {
        if(node == null)
            return arr;

        inorder2arr(node.leftNode, arr);
        arr.add(node.value);
        inorder2arr(node.rightNode, arr);

        return arr;
    }
}