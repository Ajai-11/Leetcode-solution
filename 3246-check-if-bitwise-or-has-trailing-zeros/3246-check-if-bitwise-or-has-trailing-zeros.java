class Solution {
    public boolean hasTrailingZeros(int[] nums) {
         int sum=0;
        for(int i:nums){
            if(i%2==0)
            sum++;
        }
        if(sum>1){
            return true;
        }
        else return false;
    }
}