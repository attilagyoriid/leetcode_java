package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NonOverlappingIntervalsTest {

    @Test
    void calculate() {

        NonOverlappingIntervals nonOverlappingIntervals = new NonOverlappingIntervals();
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1,2));
        list.add(Arrays.asList(2,3));
        list.add(Arrays.asList(3,4));
        list.add(Arrays.asList(1,3));

        Assertions.assertThat(nonOverlappingIntervals.calculate(list)).isEqualTo(1);

    }
}