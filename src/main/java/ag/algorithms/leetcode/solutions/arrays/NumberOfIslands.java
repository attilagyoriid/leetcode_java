package ag.algorithms.leetcode.solutions.arrays;

public class NumberOfIslands {

    public int compute(char[][] area) {
        int numberOfIslands = 0;
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[i].length; j++) {

                if (area[i][j] != '0') {
                    numberOfIslands += dfs(area, i, j);
                }


            }
        }

        return numberOfIslands;

    }

    private int dfs(char[][] area, int i, int j) {
        if (i < 0 || i >= area.length || j < 0 || j >= area[i].length || area[i][j] == '0') {
            return 0;
        }
        area[i][j] = '0';
        dfs(area, i - 1, j);
        dfs(area, i + 1, j);
        dfs(area, i, j - 1);
        dfs(area, i, j + 1);
        return 1;
    }
}
