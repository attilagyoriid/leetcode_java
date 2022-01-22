package ag.algorithms.leetcode.solutions.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    @Test
    void reverse() {
        LinkNode head = new LinkNode(4);
        LinkNode node1 = new LinkNode(6);
        LinkNode node2 = new LinkNode(9);
        node2.next = new LinkNode(12);
        node1.next = node2;
        head.next = node1;
        printLinkedList(head);
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        LinkNode reverse = reverseLinkedList.reverse(head);
        printLinkedList(reverse);
    }

    private void printLinkedList(LinkNode head) {
        while (head !=null) {
            System.out.println(head.value);
            head = head.next;
        }
    }
}