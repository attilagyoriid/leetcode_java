package ag.algorithms.leetcode.solutions.arrays;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {

    public List<List<Integer>> insert(List<List<Integer>> intervals, List<Integer> intervalToInsert) {

        if (intervalToInsert == null || intervalToInsert.size() < 1) {
            return intervals;
        }

        if (intervals == null) {
            intervals.add(intervalToInsert);
            return intervals;
        }

        List<List<Integer>> resultIntervals = new ArrayList<>();

        for (List<Integer> currentInterval : intervals) {

            if (currentInterval.get(0) > intervalToInsert.get(1)) {
                resultIntervals.add(intervalToInsert);
                int currentIndex = intervals.indexOf(currentInterval);
                List<List<Integer>> sublist = intervals.subList(currentIndex, intervals.size());
                resultIntervals.addAll(sublist);
                return resultIntervals;
            } else if (currentInterval.get(1) < intervalToInsert.get(0)) {
                resultIntervals.add(currentInterval);
            } else {
                intervalToInsert = List.of(Math.min(intervalToInsert.get(0), currentInterval.get(0)), Math.max(intervalToInsert.get(1), currentInterval.get(1)));
            }
        }

        resultIntervals.add(intervalToInsert);
        return resultIntervals;
    }

}
