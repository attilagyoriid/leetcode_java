package ag.algorithms.leetcode.solutions.graphs;

import java.util.*;

public class GraphValidTree {

    public boolean isValid(int[][] edges, int nodeNumber) {

        if (edges == null || nodeNumber < 1) {
            return true;
        }

        Map<Integer, List<Integer>> adjacencyList = new HashMap<>();

        Arrays.stream(edges).forEach(i -> {
            if (!adjacencyList.containsKey(i[0])) {
                adjacencyList.put(i[0], new ArrayList<>());
            }
            adjacencyList.get(i[0]).add(i[1]);
            if (!adjacencyList.containsKey(i[1])) {
                adjacencyList.put(i[1], new ArrayList<>());
            }
            adjacencyList.get(i[1]).add(i[0]);
        });

        Set<Integer> visited = new HashSet<>();
        // && not connected node detection
        return dfs(0, -1, adjacencyList, visited) && nodeNumber == visited.size();
    }

    private boolean dfs(int currentNode, int previous, Map<Integer, List<Integer>> adjacencyList, Set<Integer> visited) {

        //cycle detected
        if (visited.contains(currentNode)) {
            return false;
        }
        visited.add(currentNode);
        List<Integer> neighbours = adjacencyList.get(currentNode);
        for (Integer neighbour : neighbours) {
            if (neighbour == previous) {
                continue;
            }
            if (!dfs(neighbour, currentNode, adjacencyList, visited)) {
                return false;
            }
        }
        return true;
    }


}
