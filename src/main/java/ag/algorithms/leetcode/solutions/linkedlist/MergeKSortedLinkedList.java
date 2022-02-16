package ag.algorithms.leetcode.solutions.linkedlist;

import java.util.PriorityQueue;

public class MergeKSortedLinkedList {

    public ListNode merge(ListNode[] list) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (ListNode l : list) {
            while (l != null) {
                minHeap.add(l.value);
                l = l.next;
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        while (!minHeap.isEmpty()) {
            dummy.next = new ListNode(minHeap.remove());
            dummy = dummy.next;
        }
        return head.next;

    }
}
