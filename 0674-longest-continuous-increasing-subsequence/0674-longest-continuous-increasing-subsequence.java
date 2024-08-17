class Solution {
    public int findLengthOfLCIS(int[] nums) {
       if(nums==null||nums.length==0){
        return 0;
       } 
       int max=1,curr=1;
       for(int i=1;i<nums.length;i++){
         if(nums[i]>nums[i-1]){
            curr++;
            max=Math.max(max,curr);
         }
         else{
            curr=1;
         }
       }
    return max;
    }
}