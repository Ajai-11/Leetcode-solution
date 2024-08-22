class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max_avg=0;
        int n=nums.length;
        if(n<4){
            for(int i=0;i<n;i++){
                max_avg=max_avg+nums[i];
            }
            return max_avg/n;
        }
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        max_avg = (double) sum / k;
          for (int i = k; i < n; i++) {
            sum += nums[i] - nums[i - k];
            double avg = (double) sum / k;
            max_avg = Math.max(max_avg, avg);
        }

        return max_avg;
    }
}