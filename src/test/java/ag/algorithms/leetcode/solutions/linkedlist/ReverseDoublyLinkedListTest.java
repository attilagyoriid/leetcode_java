package ag.algorithms.leetcode.solutions.linkedlist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ReverseDoublyLinkedListTest {

    @Test
    void reverse() {
        DoublyListNode head = new DoublyListNode(4);
        DoublyListNode node1 = new DoublyListNode(6);
        DoublyListNode node2 = new DoublyListNode(9);
        DoublyListNode node3 = new DoublyListNode(12);
        head.next = node1;
        head.previous = null;
        node1.previous = head;
        node1.next = node2;
        node2.previous = node1;
        node2.next = node3;
        node3.previous = node2;
        node3.next = null;
        printLinkedList(head);

        List<Integer> expectedValues = Arrays.asList(12, 9, 6, 4);

        ReverseDoublyLinkedList reverseDoublyLinkedList = new ReverseDoublyLinkedList();
        DoublyListNode result = reverseDoublyLinkedList.reverse(head);
        printLinkedList(result);
        Assertions.assertThat(getLinkedListValues(result)).isEqualTo(expectedValues);
    }

    private void printLinkedList(DoublyListNode head) {
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }

    private List<Integer> getLinkedListValues(DoublyListNode head) {
        List<Integer> listValues = new ArrayList<>();
        while (head != null) {
            listValues.add(head.value);
            head = head.next;
        }
        return listValues;
    }
}