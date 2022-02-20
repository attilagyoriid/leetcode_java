package ag.algorithms.leetcode.solutions.arrays;

public class IslandPerimeter {

    public int getPerimeter(int[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return dfs(i, j, grid);
                }
            }
        }
        return 0;
    }

    private int dfs(int i, int j, int[][] grid) {
        int perimeter;
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return 1;
        }
        if (grid[i][j] == -1) {
            return 0;
        }
        grid[i][j] = -1;

        perimeter = dfs(i + 1, j, grid);
        perimeter += dfs(i - 1, j, grid);
        perimeter += dfs(i, j + 1, grid);
        perimeter += dfs(i, j - 1, grid);
        return perimeter;
    }
}
