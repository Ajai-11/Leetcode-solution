class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res=new ArrayList<>();
        String s="";
        s=s+x;
        for(int i=0;i<words.length;i++){
            if(words[i].contains(s))
            res.add(i);
        }
        return res;
    }
}