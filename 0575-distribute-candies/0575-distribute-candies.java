class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> s=new HashSet<>();
        for(int i:candyType)
        {
            s.add(i);
        }
        int a=s.size();
        int k=candyType.length/2;
        if(a>k)
        return k;
        else
        return a;
    }
}