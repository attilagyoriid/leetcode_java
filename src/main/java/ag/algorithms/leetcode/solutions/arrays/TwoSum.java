package ag.algorithms.leetcode.solutions.arrays;

import java.util.HashMap;

public class TwoSum {

    public int[] compute(int[] list, int sum) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.length; i++) {

            int difference = sum - list[i];
            if (map.containsKey(difference)) {
                return new int[] {map.get(difference), i};
            }
            map.put(list[i], i);

        }

        return null;

    }

}
