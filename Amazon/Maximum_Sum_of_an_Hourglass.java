class Solution {
    public int maxSum(int[][] grid) {
        int max = 0;
        int m = grid.length;
        for (int i = 0; i < m; i++) {
            int n = grid[i].length;
            for (int j = 0; j < n; j++) {
                int sum = 0;
                if (i < (m - 2) && j < (n - 2)) {
                    sum += grid[i][j] + grid[i][j + 1] + grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j]
                            + grid[i + 2][j + 1] + grid[i + 2][j + 2];
                }
                if (sum > max)
                    max = sum;
            }
        }
        return max;
    }
}