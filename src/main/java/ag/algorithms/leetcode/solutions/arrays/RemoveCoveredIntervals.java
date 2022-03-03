package ag.algorithms.leetcode.solutions.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RemoveCoveredIntervals {

    public int getIntervalsWotCoveredRemoved(List<List<Integer>> intervals) {


        List<List<Integer>> intervalsC = new ArrayList<>(intervals);
        Comparator<List<Integer>> listComparator = Comparator.comparingInt(a -> a.get(0));
        Comparator<List<Integer>> listComparatorCombined = listComparator.thenComparing((a, b) -> b.get(1) - a.get(1));
        intervalsC.sort(listComparatorCombined);
        int size = intervalsC.size();


        for (int i = 1; i < intervalsC.size(); i++) {
            if (intervalsC.get(i - 1).get(0) <= intervalsC.get(i).get(0) && intervalsC.get(i - 1).get(1) >= intervalsC.get(i).get(1)) {
                size--;
            }
        }

        return size;
    }

    public int getIntervalsWotCoveredRemoved2(List<List<Integer>> intervals) {


        List<List<Integer>> intervalsC = new ArrayList<>(intervals);
        Comparator<List<Integer>> listComparator = Comparator.comparingInt(a -> a.get(0));
        Comparator<List<Integer>> listComparatorCombined = listComparator.thenComparing((a, b) -> b.get(1) - a.get(1));
        intervalsC.sort(listComparatorCombined);
        int size = intervalsC.size();
        List<List<Integer>> intervalsResult = new ArrayList<>();
        intervalsResult.add(intervalsC.get(0));

        for (int i = 1; i < intervalsC.size(); i++) {
            int currentLeft = intervalsC.get(i).get(0);
            int currentRight = intervalsC.get(i).get(1);
            int previousLeft = intervalsC.get(i-1).get(0);
            int previousRight = intervalsC.get(i-1).get(1);
            if (previousLeft <= currentLeft && previousRight >= currentRight) {
                continue;
            }
            intervalsResult.add(intervalsC.get(i));
        }

        return intervalsResult.size();
    }

}
