class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int k=(a&b)<<1;
            a=a^b;
            b=k;
        }
        return a;
    }
}