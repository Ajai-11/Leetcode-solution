class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left_sum=0,right_sum=0,sum=0,max=Integer.MIN_VALUE;
        int i,j=cardPoints.length-1; 
        for(i=0;i<=k-1;i++)
        {
            left_sum = left_sum+cardPoints[i];
        } 
        
        max = left_sum; 
        for(i=k-1 ; i>=0 ; i--)
        { 
            left_sum = left_sum-cardPoints[i];  
            right_sum = right_sum + cardPoints[j]; 
            sum = left_sum+right_sum;   
            j--;
            if(max < sum)
            {
                max = sum;
            }
            
        } 
        return max; 
    }
}