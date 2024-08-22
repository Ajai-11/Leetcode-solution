class Solution {
    public int removeElement(int[] nums, int val) {
        int start=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
               nums[start]=nums[i];
               start++;
            }
        }
        for(int i=start;i<nums.length;i++){
            nums[start]=val;
        }
        start=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val)
            break;
            start++;
        }
        return start;
    }
}