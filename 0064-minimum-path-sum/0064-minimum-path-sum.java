class Solution {
    public int minPathSum(int[][] grid) {
                int n,m; 
         n = grid.length; 
         m = grid[0].length;  
         int[][] dp = new int[n+1][m+1]; 
         int i,j; 
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=m;j++)
            {
              if(i==0 || j==0)
             {
                dp[i][j] = Integer.MAX_VALUE/2;
             } 
             else if(i==1&&j==1)
             {
                dp[i][j] = grid[0][0];
             }
             else 
             {
                dp[i][j] = Math.min(grid[i-1][j-1]+dp[i-1][j],grid[i-1][j-1]+dp[i][j-1]);
             }
            }
        }
         return dp[n][m];  
    }
}