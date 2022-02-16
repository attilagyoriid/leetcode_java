package ag.algorithms.leetcode.solutions.linkedlist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MergeKSortedLinkedListTest {

    @Test
    void merge() {
        ListNode head1 = new ListNode(1);
        ListNode head12 = new ListNode(2);
        ListNode head13 = new ListNode(4);
        head1.next = head12;
        head12.next = head13;

        ListNode head2 = new ListNode(1);
        ListNode head22 = new ListNode(3);
        ListNode head23 = new ListNode(4);
        head2.next = head22;
        head22.next = head23;

        ListNode head3 = new ListNode(2);
        ListNode head32 = new ListNode(5);
        ListNode head33 = new ListNode(7);
        head3.next = head32;
        head32.next = head33;

        MergeKSortedLinkedList mergekSortedLinkedList = new MergeKSortedLinkedList();

        ListNode mergedList = mergekSortedLinkedList.merge(new ListNode[]{head1, head2, head3});
        List<Integer> result = new ArrayList<>();
        while (mergedList != null) {
            result.add(mergedList.value);
            mergedList = mergedList.next;
        }
        Assertions.assertThat(result).isEqualTo(Arrays.asList(1, 1, 2,2 , 3, 4, 4, 5, 7));
    }
}