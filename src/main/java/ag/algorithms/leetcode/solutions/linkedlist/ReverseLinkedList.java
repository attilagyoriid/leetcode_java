package ag.algorithms.leetcode.solutions.linkedlist;

public class ReverseLinkedList {

    public LinkNode reverse(LinkNode head) {
        LinkNode curr = head;
        LinkNode prev = null;
        while (curr != null) {

            LinkNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;


        }
        return prev;

    }
}
