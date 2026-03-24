class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int dp[][]=new int[m][n];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return helper(0,0,grid,dp);
    }
    public int helper(int i,int j,int grid[][],int dp[][]){
        int m=grid.length;
        int n=grid[0].length;
        if(i>=m||j>=n) return Integer.MAX_VALUE;
        if(i==m-1&&j==n-1) return grid[m-1][n-1];
        if(dp[i][j]!=-1) return dp[i][j];
        int right=helper(i,j+1,grid,dp);
        int down=helper(i+1,j,grid,dp);
        dp[i][j]=grid[i][j]+Math.min(right,down);
        return dp[i][j];
    }
}