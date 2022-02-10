package ag.algorithms.leetcode.solutions.arrays;

import java.util.List;

public class NonOverlappingIntervals {

    public int calculate(List<List<Integer>> intervals) {
        int deletedIntervals = 0;

        int prevEnd = intervals.get(0).get(1);

        for (int i = 1; i < intervals.size(); i++) {

            if (intervals.get(i).get(0) >= prevEnd) {
                prevEnd = intervals.get(i).get(1);
            } else {
                deletedIntervals++;
                prevEnd = Math.min(prevEnd, intervals.get(i).get(1));
            }


        }

        return deletedIntervals;


    }
}
