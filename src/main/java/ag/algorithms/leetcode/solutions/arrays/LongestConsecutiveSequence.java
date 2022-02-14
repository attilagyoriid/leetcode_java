package ag.algorithms.leetcode.solutions.arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {

    public int compute(int[] list) {

        if (list == null || list.length < 1) {
            return 0;
        }

        Set<Integer> sequenceSet = Arrays.stream(list).boxed().collect(Collectors.toSet());

        int longest = 0;

        for (int number : list) {
            if (!sequenceSet.contains(number - 1)) {
                int index = 0;
                while (sequenceSet.contains(number + index)) {
                    index++;
                }
                longest = Math.max(longest, index);
            }

        }
        return longest;


    }
}
