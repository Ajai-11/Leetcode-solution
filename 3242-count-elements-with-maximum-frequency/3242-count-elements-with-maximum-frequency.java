class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    arr[i]=arr[i]+1;
                }
            }
        }
       Arrays.sort(arr);
       int a=arr[n-1];
       int freq=0;
       for(int i=0;i<n;i++){
        if(arr[i]==a)
         freq+=1;
       } 
       return freq;
    }
}