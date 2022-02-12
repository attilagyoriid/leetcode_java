package ag.algorithms.leetcode.solutions.arrays;

import ag.algorithms.leetcode.solutions.model.Interval;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumMeetingRoomsTest {

    @Test
    void calculate() {

        MaximumMeetingRooms maximumMeetingRooms = new MaximumMeetingRooms();

        int result = maximumMeetingRooms.calculate(new Interval[]{new Interval(0, 30), new Interval(5, 10), new Interval(15, 20)});

        Assertions.assertThat(result).isEqualTo(2);


    }
}