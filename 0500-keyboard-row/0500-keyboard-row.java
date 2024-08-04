class Solution {
    public String[] findWords(String[] words) {
       String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
        
            String key = word.toLowerCase();
            String row = null;
            if (row1.indexOf(key.charAt(0)) != -1) {
                row = row1;
            } else if (row2.indexOf(key.charAt(0)) != -1) {
                row = row2;
            } else if (row3.indexOf(key.charAt(0)) != -1) {
                row = row3;
            }
            
            boolean type = true;
            for (int i = 1; i < key.length(); i++) {
                if (row.indexOf(key.charAt(i)) == -1) {
                    type = false;
                    break;
                }
            }
            
            if (type) {
                result.add(word);
            }
        }
        
       
        return result.toArray(new String[0]);
    }
}