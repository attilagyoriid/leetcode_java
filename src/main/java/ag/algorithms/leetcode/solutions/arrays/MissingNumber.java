package ag.algorithms.leetcode.solutions.arrays;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class MissingNumber {

    public int calculate(int[] items) {
        int result = items.length;

        for (int i = 0; i < items.length; i++) {
            result += (i - items[i]);
        }

        return result;
    }

    public int getMissingNumberWithSet(List<Integer> items) {
        Set<Integer> lookUpList = new HashSet();

        IntStream.range(0, items.size() + 1).forEach(i -> lookUpList.add(i));

        lookUpList.removeIf(i -> items.contains(i));
        return lookUpList.stream().findFirst().get();

    }

    public int getMissingNumberWithXOR(List<Integer> items) {
        int result = 0;
        for (int i: items) {
            result ^= i;
        }
        for (int i = 0; i <= items.size(); i++) {
            result ^= i;
        }

        return result;

    }

    public int getMissingNumberWithSubtraction(List<Integer> items) {
        int result = IntStream.range(0, items.size() + 1).sum();
        int listSum = items.stream().mapToInt(Integer::valueOf)
                .sum();
        return result - listSum;

    }
}
