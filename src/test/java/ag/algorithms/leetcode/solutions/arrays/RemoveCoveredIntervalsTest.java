package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class RemoveCoveredIntervalsTest {

    @Test
    void getIntervalsWotCoveredRemoved() {
        RemoveCoveredIntervals removeCoveredIntervals = new RemoveCoveredIntervals();
        Assertions.assertThat(removeCoveredIntervals.getIntervalsWotCoveredRemoved(List.of(List.of(1, 4), List.of(3, 6), List.of(2, 8))))
                .isEqualTo(2);
    }

    @Test
    void getIntervalsWotCoveredRemoved_withSameStartInterval() {
        RemoveCoveredIntervals removeCoveredIntervals = new RemoveCoveredIntervals();
        Assertions.assertThat(removeCoveredIntervals.getIntervalsWotCoveredRemoved(List.of(List.of(1, 3), List.of(1, 4), List.of(3, 6), List.of(2, 8))))
                .isEqualTo(2);
    }
}