class Solution {
    public int hIndex(int[] citations) {
        int count[]=new int[citations.length+1];
        for(int i:citations){
            if(i>=citations.length){
                count[citations.length]+=1;
            }
            else{
                count[i]+=1;
            }
        }
        int cit=0;
        for(int i=citations.length;i>=0;i--){
            cit+=count[i];
            if(cit>=i){
                return i;
            }
        }
        return 0;
    }
}