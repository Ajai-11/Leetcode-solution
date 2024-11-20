class Solution {
    public boolean isPerfectSquare(int num) {
       int sqrt=(int)Math.sqrt(num);
       int ans=sqrt*sqrt;
       return ans==num; 
    }
}