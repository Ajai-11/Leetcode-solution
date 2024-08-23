class Solution {
    public String reverseOnlyLetters(String s) {
      char str[]=s.toCharArray();
    int i=0;
    int j=str.length-1;
    while(i<=j){
        if(Character.isAlphabetic(str[i])&&Character.isAlphabetic(str[j])){
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        else if(Character.isAlphabetic(str[i]))
        j--;
        else
        i++;
    }
    return new String(str);
    }
}