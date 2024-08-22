class Solution {
    public int singleNumber(int[] nums) {
        int a=0,b=0,c=0;
        for(int i=0;i<nums.length;i++){
           b=b|a&nums[i];
           a=a^nums[i];
           c=a&b;
           a=a&~c;
           b=b&~c;

        }
        return a;
    }
}