package ag.algorithms.leetcode.solutions.arrays;

import ag.algorithms.leetcode.solutions.model.Interval;

import java.util.Arrays;
import java.util.Comparator;


public class MeetingRooms {

    public boolean canAttendAll(Interval[] meetings) {

        Arrays.sort(meetings, Comparator.comparing(Interval::getStart));

        for (int i = 1; i < meetings.length; i++) {
            if (meetings[i - 1].getEnd() > meetings[i].getStart()) {
                return false;
            }

        }
        return true;
    }

}
