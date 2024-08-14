class Solution {
    public String countAndSay(int n) {
        
        int j;
        String str1 ="1";  
      for(j=1 ; j<=n-1 ;j++)
      { 
        String str2 = ""; 
        int i,count=1; 
        for(i=0 ; i<=str1.length()-2;i++) 
        {
             if(str1.charAt(i)==str1.charAt(i+1))
             {
                count++; 
             } 
             else 
             {
                str2 = str2+count;   
                str2 = str2+str1.charAt(i); 
                count = 1;
             }
        } 
         str2 = str2+count;  
         str2 = str2+str1.charAt(i);  
         str1 = str2; 
      }
      return str1;
    }
}