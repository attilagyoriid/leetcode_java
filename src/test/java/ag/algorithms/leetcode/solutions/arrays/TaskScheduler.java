package ag.algorithms.leetcode.solutions.arrays;

import java.util.*;

public class TaskScheduler {

    public int leastTime(char[] tasks, int timeToCoolDown) {

        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : tasks) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        maxHeap.addAll(charMap.values());
        int time = 0;
        Deque<List<Integer>> taskAndTime = new LinkedList<>();

        while (!maxHeap.isEmpty() || !taskAndTime.isEmpty()) {
            time++;
            if (!maxHeap.isEmpty()) {
                int currentTaskCount = maxHeap.remove()-1;
                if (currentTaskCount > 0) {
                    taskAndTime.add(Arrays.asList(currentTaskCount,time+timeToCoolDown));
                }
                if (!taskAndTime.isEmpty() && taskAndTime.peek().get(1) == time) {
                    maxHeap.add(taskAndTime.remove().get(0));
                }
            }
        }

        return time;

    }

}
