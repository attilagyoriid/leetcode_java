package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InsertIntervalTest {

    @Test
    void insert() {

        InsertInterval insertInterval = new InsertInterval();

        Assertions.assertThat(insertInterval.insert(List.of(List.of(1, 2), List.of(3, 5), List.of(6, 7), List.of(8, 10), List.of(12, 16)), List.of(4, 8)))
                .isEqualTo(List.of(List.of(1, 2), List.of(3, 10), List.of(12, 16)));
    }
}