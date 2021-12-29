package ag.algorithms.leetcode.solutions.arrays;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInArray {

    /**
     * @param nums array of numbers to search duplicates in
     * @return true if there are duplicate items in array
     */
    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) return false;

        Map<Integer, Boolean> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) return true;
            map.put(num, true);
        }
        return false;
    }
}
