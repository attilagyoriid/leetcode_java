package ag.algorithms.leetcode.solutions.graphs;

import java.util.*;

public class CourseSchedule {

    public boolean canFinish(int coursesNumber, int[][] prerequisites) {
        Map<Integer, List<Integer>> adjacencyList = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        //initialize with empty list (prerequisites)
        for (int i = 0; i < coursesNumber; i++) {
            adjacencyList.put(i, new ArrayList<>());
        }
        //create adjacency list
        for (int[] i : prerequisites) {
            adjacencyList.get(i[0]).add(i[1]);
        }


        //visit all node (course)
        for (int course = 0; course < coursesNumber; course++) {

            if (!dfs(course, adjacencyList, visited)) {
                return false;
            }

        }
        return true;
    }

    private boolean dfs(int course, Map<Integer, List<Integer>> adjacencyList, Set<Integer> visited) {
        if (visited.contains(course)) {
            return false;
        }
        //leaf node, no prerequisite
        if (adjacencyList.get(course).size() == 0) {
            return true;
        }
        visited.add(course);
        //iterate prerequisites of course
        for (Integer prerequisite : adjacencyList.get(course)) {
            if (!dfs(prerequisite, adjacencyList, visited)) {
                return false;
            }
        }

        visited.remove(course);
        //empty prerequisites for visited course
        adjacencyList.get(course).removeAll(adjacencyList.get(course));
        return true;
    }
}
