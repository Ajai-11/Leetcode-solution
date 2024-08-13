class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                sum=sum^nums[i];
            }
            set.add(nums[i]);
        }
        return sum;
    }
}