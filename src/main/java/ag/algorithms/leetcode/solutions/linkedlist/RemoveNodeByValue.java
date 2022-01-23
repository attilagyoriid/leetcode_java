package ag.algorithms.leetcode.solutions.linkedlist;

public class RemoveNodeByValue {

    public ListNode removeAllNodesByValue(ListNode head, int value) {

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode prev = dummyNode;
        ListNode curr = head;

        while (curr != null) {
            ListNode nxt = curr.next;
            if (curr.value == value) {
                prev.next = nxt;
            } else {
                prev = curr;
            }

            curr = nxt;

        }

        return dummyNode.next;
    }
}
