class Solution {
    public String reorganizeString(String s) {
        int n=s.length();
        int count[]=new int[26];
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        int maxCount = 0;
        int letter = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                letter = i;
            }
        }
        if (maxCount > (n + 1) / 2) {
            return "";
        }
        char[] result = new char[n];
        int index = 0;
        while (count[letter] > 0) {
            result[index] = (char) (letter + 'a');
            index += 2;
            count[letter]--;
        }
          for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                if (index >= n) {
                    index = 1;  
                }
                result[index] = (char) (i + 'a');
                index += 2;
                count[i]--;
            }
        }
         return new String(result);

    }
}