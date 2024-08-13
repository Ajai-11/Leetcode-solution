class Solution {
    public boolean isPossibleToSplit(int[] nums) {
       int n=nums.length;
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(nums[i]==nums[j])
            arr[i]+=1;
        }
       } 
       
       for(int i=0;i<n;i++){
        if(arr[i]>2)
        return false;
       }
       return true;
    }
}