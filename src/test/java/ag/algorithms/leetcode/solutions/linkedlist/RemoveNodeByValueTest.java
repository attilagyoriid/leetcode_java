package ag.algorithms.leetcode.solutions.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNodeByValueTest {

    @Test
    void removeAllNodesByValue() {
        ListNode head = new ListNode(4);
        ListNode node1 = new ListNode(6);
        ListNode node2 = new ListNode(9);
        node2.next = new ListNode(12);
        node1.next = node2;
        head.next = node1;
        printLinkedList(head);
        RemoveNodeByValue removeNodeByValue = new RemoveNodeByValue();
        ListNode newHead = removeNodeByValue.removeAllNodesByValue(head, 6);
        printLinkedList(newHead);
    }



    private void printLinkedList(ListNode head) {
        while (head !=null) {
            System.out.println(head.value);
            head = head.next;
        }
    }
}