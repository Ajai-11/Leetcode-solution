class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        int n=s.length();
        int arr1[]=new int[200];
        int arr2[]=new int[200];
        for(int i=0;i<n;i++){
            if(arr1[s.charAt(i)]!=arr2[t.charAt(i)])
            return false;
            arr1[s.charAt(i)]=i+1;
            arr2[t.charAt(i)]=i+1;
        }
        return true;
    }
}