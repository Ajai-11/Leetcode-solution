class Solution {
    public String shortestPalindrome(String s) {
  String rev = new StringBuilder(s).reverse().toString();
        String comb = s + "#" + rev;
        int[] lps = new int[comb.length()];
        
        for (int i = 1; i < comb.length(); i++) {
            int j = lps[i - 1];
            while (j > 0 && comb.charAt(i) != comb.charAt(j)) {
                j = lps[j - 1];
            }
            if (comb.charAt(i) == comb.charAt(j)) {
                j++;
            }
            lps[i] = j;
        }
        
        int len = lps[comb.length() - 1];
        String add = rev.substring(0, s.length() - len);
        return add + s;
    }}