class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length,max=1;
        if(n==0)
        return 0;
        Set<Integer> set=new HashSet<>();
        int count=1;
        for(int i:nums){
            set.add(i);
        }
        for(int x:set){
            if(!set.contains(x-1)){
                count=1;
                int temp=x;
                while(set.contains(temp+1)){
                    count++;
                    temp++;
                }
            }
            if(count>max)
            max=count;
        }return max;
    }
}