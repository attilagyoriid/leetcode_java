package ag.algorithms.leetcode.solutions.linkedlist;


public class ReverseDoublyLinkedList {

    public DoublyListNode reverse(DoublyListNode head) {

        if (head == null) {
            return null;
        }

        DoublyListNode newHead = head;
        DoublyListNode currentNode = head;

        while (currentNode != null) {

            DoublyListNode previous = currentNode.previous;
            currentNode.previous = currentNode.next;
            currentNode.next = previous;
            newHead = currentNode;

            currentNode = currentNode.previous;


        }
        return newHead;

    }
}
