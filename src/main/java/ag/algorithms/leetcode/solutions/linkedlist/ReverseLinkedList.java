package ag.algorithms.leetcode.solutions.linkedlist;

public class ReverseLinkedList {

    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;


        }
        return prev;

    }
}
