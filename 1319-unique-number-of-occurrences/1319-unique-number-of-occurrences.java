class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int count : map.values()) {
            if (!set.add(count)) {
                return false;
            }
        }
        return true;
    }
}