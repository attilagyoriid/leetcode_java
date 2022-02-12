package ag.algorithms.leetcode.solutions.arrays;

import ag.algorithms.leetcode.solutions.model.Interval;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MeetingRoomsTest {

    @Test
    void canAttendAll() {

        MeetingRooms meetingRooms = new MeetingRooms();

        boolean canAttend = meetingRooms.canAttendAll(new Interval[]{new Interval(1, 4), new Interval(4, 5), new Interval(5, 8), new Interval(8, 16)});
        Assertions.assertThat(canAttend).isTrue();
    }

    @Test
    void canAttendAll_failure() {

        MeetingRooms meetingRooms = new MeetingRooms();

        boolean canAttend = meetingRooms.canAttendAll(new Interval[]{new Interval(1, 4), new Interval(4, 5), new Interval(5, 8), new Interval(8, 16), new Interval(1, 4)});
        Assertions.assertThat(canAttend).isFalse();
    }
}