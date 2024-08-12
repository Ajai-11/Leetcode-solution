class Solution {
    public boolean canAliceWin(int[] nums) {
        int n=nums.length;
        int sum=0,sum1=0;
        for(int i=0;i<n;i++){
            int k=(nums[i]/10);
            if(k!=0)
            sum+=nums[i];
            else
            sum1+=nums[i];
        }
        if(sum>sum1 || sum<sum1)
        return true;
        else
        return false;
    }
}