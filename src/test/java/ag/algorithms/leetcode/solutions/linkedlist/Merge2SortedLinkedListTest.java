package ag.algorithms.leetcode.solutions.linkedlist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Merge2SortedLinkedListTest {

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


        Merge2SortedLinkedList merge2SortedLinkedList = new Merge2SortedLinkedList();

        ListNode mergedList = merge2SortedLinkedList.merge(head1, head2);
        List<Integer> result = new ArrayList<>();
        while (mergedList != null) {
            result.add(mergedList.value);
            mergedList = mergedList.next;
        }
        Assertions.assertThat(result).isEqualTo(Arrays.asList(1, 1, 2, 3, 4, 4));
    }
}