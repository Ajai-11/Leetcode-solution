class Solution {
    public int[] decode(int[] encoded) {
        int n=encoded.length+1;
        int arr[]=new int[n];
        int total=0;
        for(int i=1;i<=n;i++){
           total=total^i;
        }
        int ind=0;
        for(int i=1;i<n-1;i+=2){
             ind=ind^encoded[i];
        }
        arr[0]=total^ind;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] ^ encoded[i - 1];
        }
        return arr;
    }
}