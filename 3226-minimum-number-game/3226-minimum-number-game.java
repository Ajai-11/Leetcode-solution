class Solution {
    public int[] numberGame(int[] nums) {
    int n=nums.length;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
           if(i%2!=0){
            int temp=nums[i];
            nums[i]=nums[i-1];
            nums[i-1]=temp;
           }
        }
       
     return nums;
    }
}