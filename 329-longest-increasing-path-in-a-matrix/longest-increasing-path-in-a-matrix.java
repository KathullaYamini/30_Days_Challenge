class Solution {
    private int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    private int m, n;
    
    public int longestIncreasingPath(int[][] matrix) {
        m = matrix.length;
        n = matrix[0].length;
        int[][] dp = new int[m][n];  
        int maxLen = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                maxLen = Math.max(maxLen, dfs(matrix, i, j, dp));
            }
        }
        return maxLen;
    }
    
    private int dfs(int[][] matrix, int i, int j, int[][] dp) {
        if (dp[i][j] != 0) return dp[i][j];  
        
        int max = 1; 
        for (int[] d : directions) {
            int x = i + d[0], y = j + d[1];
            if (x >= 0 && x < m && y >= 0 && y < n && matrix[x][y] > matrix[i][j]) {
                max = Math.max(max, 1 + dfs(matrix, x, y, dp));
            }
        }
        dp[i][j] = max;
        return max;
    }
}
