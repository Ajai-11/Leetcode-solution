class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length()) return false;
        for(int i = 0 ; i< words.size(); i++){    
            String str = words.get(i);
            if(s.charAt(i)!=str.charAt(0)){
                return false;
            }
        }
        return true;
    }
}