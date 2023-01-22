class Solution {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int r = Math.max(0, i - K); r <= i + K && r < m; r++) {
                    for (int c = Math.max(0, j - K); c <= j + K && c < n; c++)
                        sum = sum + mat[r][c];
                }
                arr[i][j] = sum;
            }
        }
        return arr;
    }
}