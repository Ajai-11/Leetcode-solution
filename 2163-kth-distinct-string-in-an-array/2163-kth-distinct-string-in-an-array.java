class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n=arr.length;
        List<String> y=new ArrayList<>();
        for(int i=0;i<n;i++){
            String a=arr[i];
            boolean res=false;
            for(int j=0;j<n;j++){
                if(a.equals(arr[j])&&i!=j){
                    res=true;
                    break;
                }
            }
            if(!res){
                y.add(a);
            }
        }
        if(y.size()>=k)
        return y.get(k-1);
        else
        return "";
    }
}