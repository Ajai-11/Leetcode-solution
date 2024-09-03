class Solution {
    public int getLucky(String s, int k) {
       StringBuilder str=new StringBuilder();
       int sum=0;
       char ch[]=s.toCharArray();
       for(char c:ch){
        int n=c-'a'+1;
        str.append(n);
       }
       String str1=str.toString();
       for(int i=0;i<k;i++){
        sum=0;
        for(char c:str1.toCharArray()){
            sum=sum+(c-'0');
        }
        str1=String.valueOf(sum);
       }
       return sum;
    }
}