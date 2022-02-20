package ag.algorithms.leetcode.solutions.arrays;

public class WordSearch {

    public boolean isFound(char[][] grid, String word) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == word.charAt(0) && dfs(i, j, grid, 0, word)) {
                    return true;
                }
            }
        }
        return false;

    }

    private boolean dfs(int row, int column, char[][] grid, int indexInWorld, String word) {

        if (indexInWorld == word.length()) {
            return true;
        }
        if (row < 0 || column < 0 || row >= grid.length || column >= grid[0].length || grid[row][column] != word.charAt(indexInWorld)) {
            return false;
        }
        char temp = grid[row][column];
        grid[row][column] = ' ';
        boolean found =
                dfs(row - 1, column, grid, indexInWorld + 1, word) ||
                        dfs(row + 1, column, grid, indexInWorld + 1, word) ||
                        dfs(row, column + 1, grid, indexInWorld + 1, word) ||
                        dfs(row, column - 1, grid, indexInWorld + 1, word);
        grid[row][column] = temp;
        return found;

    }
}
