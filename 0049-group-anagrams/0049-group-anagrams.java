class Solution {
   
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map=new HashMap<>();
       for(String word:strs){
        char s[]=word.toCharArray();
        Arrays.sort(s);
        String s1=new String(s);
        if(!map.containsKey(s1)){
            map.put(s1,new ArrayList<>());
        }
        map.get(s1).add(word);
       }
       return new ArrayList<>(map.values());
        
    }
}