package ag.algorithms.leetcode.solutions.arrays;

import ag.algorithms.leetcode.solutions.model.Interval;

import java.util.Arrays;

public class MaximumMeetingRooms {

    public int calculate(Interval[] intervals) {

        var starts = Arrays.stream(intervals).mapToInt(Interval::getStart).sorted().toArray();
        var ends = Arrays.stream(intervals).mapToInt(Interval::getEnd).sorted().toArray();

        int start = 0;
        int end = 0;
        int currentMeetingRoomCount = 0;
        int result = 0;

        while (start < intervals.length) {

            if (starts[start] < ends[end]) {
                start++;
                currentMeetingRoomCount++;
            } else {
                end++;
                currentMeetingRoomCount--;
            }

            result = Math.max(result, currentMeetingRoomCount);


        }
        return result;

    }
}
