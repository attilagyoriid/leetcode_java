package ag.algorithms.leetcode.solutions.linkedlist;

public class Merge2SortedLinkedList {

    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        while (list1 != null && list2 != null) {

            if (list1.value < list2.value) {
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }

            head = head.next;
        }

        if (list1 !=null) {
            head.next = list1;
        }

        if (list2 !=null) {
            head.next = list2;
        }

        return dummy.next;

    }
}
