class Solution
{
   
    public int uniquePaths(int n, int m)
    {
         int[][] dp = new int[n+1][m+1]; 
         int i,j; 
         for(i=0;i<=n;i++)
         {
             for(j=0;j<=m;j++)
             {
                 if(i==0 || j==0)
                 {
                     dp[i][j] = 0;
                 }
                 else if(i==1&&j==1)
                 {
                     dp[i][j] =1;
                 }
                 else
                 {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1]; 
                 }
             }
         }
        return dp[n][m];
    }
}