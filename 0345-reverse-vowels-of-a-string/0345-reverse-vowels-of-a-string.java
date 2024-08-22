class Solution {
    public boolean isVowel(char i){
        if(i=='A'||i=='E'||i=='O'||i=='U'||i=='I'||i=='a'||i=='e'||i=='o'||i=='u'||i=='i')
        return true;
        else
        return false;
    }
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        char str[]=s.toCharArray();
        while(i<=j){
            char a=str[i];
            char b=str[j];
            if(isVowel(a)&&isVowel(b))
            {
              str[i]=b;
              str[j]=a;
                i++;
                j--;
            }
            else if(isVowel(a)){
                j--;
            }
            else{
                i++;
            }

        }
        return new String(str);
    }
}