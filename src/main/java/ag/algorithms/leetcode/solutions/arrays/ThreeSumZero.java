package ag.algorithms.leetcode.solutions.arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumZero {

    public List<List<Integer>> calculate(int[] items) {
        int left;
        int right;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(items);

        for (int i = 0; i < items.length; i++) {
            if (i > 0 && items[i] == items[i - 1]) {
                continue;
            }
            left = i + 1;
            right = items.length - 1;
            while (left < right) {
                int localResult = items[i] + items[left] + items[right];
                if (localResult > 0) {
                    right--;
                } else if (localResult < 0) {
                    left++;
                } else {
                    result.add(Arrays.asList(items[i], items[left], items[right]));
                    left++;
                    while (left < right && items[left] == items[left-1]) {
                        left++;
                    }
                }
            }
        }

        return result;


    }
}
