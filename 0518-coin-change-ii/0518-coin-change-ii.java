class Solution {
    public int change(int amount, int[] coins) {
           
          int n = coins.length;
          int[][] dp = new int[n][amount+1]; 
          int i,j; 
          for(i=0;i<=n-1;i++)
          {
            for(j=0;j<=amount;j++)
            {
                if(j==0)
                {
                    dp[i][j] =1;
                }
                else if(i==0)
                {
                    if(j%coins[i]==0)
                    {
                        dp[i][j] =1;
                    }
                    else 
                    {
                        dp[i][j] = 0;
                    }
                }
                else 
                {
                    int take=0; 
                    int not_take = dp[i-1][j]; 
                    if(coins[i]<=j)
                    {
                      take =dp[i][j-coins[i]];
                    }
                   dp[i][j]=take+not_take;
                }
            }
          }
          return dp[n-1][amount];

    }
}