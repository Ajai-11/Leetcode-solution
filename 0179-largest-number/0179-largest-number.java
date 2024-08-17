class Solution {
    public String largestNumber(int[] nums) {
      String str[]=new String[nums.length]; 
      for(int i=0;i<nums.length;i++){
        str[i]=String.valueOf(nums[i]);
      } 
      StringBuilder res=new StringBuilder();
      Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
      for(int i=0;i<nums.length;i++){
        res.append(str[i]);
      }
      return res.charAt(0)=='0'?"0":res.toString();
    }
}