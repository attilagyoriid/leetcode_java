package ag.algorithms.leetcode.solutions.graphs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CourseScheduleTest {

    @Test
    void canFinish() {

        CourseSchedule courseSchedule = new CourseSchedule();

        int courseNumber = 5;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {4, 1}, {4, 3}};
        Assertions.assertThat(courseSchedule.canFinish(courseNumber, prerequisites)).isTrue();
    }
}