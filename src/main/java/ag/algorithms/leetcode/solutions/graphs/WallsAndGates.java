package ag.algorithms.leetcode.solutions.graphs;



public class WallsAndGates {

    public int[][] calculateShortestDistanceToGatesDFS(int[][] grid) {

        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                if (grid[row][column] == 0) {
                    dfs(row, column, grid, 0);
                }
            }
        }
        return grid;
    }

    private void dfs(int row, int column, int[][] grid, int distance) {

        if (row < 0 || row >= grid.length || column < 0 || column >= grid[0].length || grid[row][column] == -1 || grid[row][column] < distance) {
            return;
        }
        grid[row][column] = distance;

        dfs(row + 1, column, grid, distance + 1);
        dfs(row - 1, column, grid, distance + 1);
        dfs(row, column + 1, grid, distance + 1);
        dfs(row, column - 1, grid, distance + 1);

    }

}
