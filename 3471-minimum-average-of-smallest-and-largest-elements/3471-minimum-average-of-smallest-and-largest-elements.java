class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        double avg[]=new double[n/2];
        Arrays.sort(nums);
        int a=0,b=n-1;
        for(int i=0;i<n/2;i++){
            avg[a]=(nums[a]+nums[b])/2.0;
            a++;
            b--;
        }
        Arrays.sort(avg);
        return avg[0];
    }
}