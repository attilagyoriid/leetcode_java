package ag.algorithms.leetcode.solutions.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskSchedulerTest {

    @Test
    void leastTime() {

        TaskScheduler taskScheduler = new TaskScheduler();
        Assertions.assertThat(taskScheduler.leastTime(new char[]{'A','B', 'C', 'B', 'C', 'A','A'},1)).isEqualTo(7);
    }
}