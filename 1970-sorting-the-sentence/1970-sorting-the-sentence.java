class Solution {
    public String sortSentence(String s) {
     String str[]=s.split(" ");
     int n=str.length;
     String result[]=new String[n];   
     StringBuilder a=new StringBuilder();
     int i=0;
     for(String str1:str){
        int k=str1.length();
        i=(int)str1.charAt(k-1)-'0';
        result[i-1]=str1.substring(0,k-1);
     }
     for(int j=0;j<n;j++){
        if(j!=n-1)
        a.append(result[j]).append(" ");
        else
        a.append(result[j]);
     }
     return a.toString();
    }
}