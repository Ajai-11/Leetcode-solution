class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int left=0;
        int cur=0;
        for(int i=0;i<nums.length;i++){
            cur+=nums[i];
            while(cur>=target){
                if(i-left+1<min)
                min=i-left+1;
                cur-=nums[left];
                left++;
            }
        }
        return min!=Integer.MAX_VALUE?min:0;
    }
}