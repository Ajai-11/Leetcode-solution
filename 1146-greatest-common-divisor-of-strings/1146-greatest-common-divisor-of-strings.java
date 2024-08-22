class Solution {
   private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
     private boolean isDiv(String str, String sub) {
        if (str.length() % sub.length() != 0) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() / sub.length(); i++) {
            sb.append(sub);
        }
        return sb.toString().equals(str);
    }
    public String gcdOfStrings(String str1, String str2) {
        int n = gcd(str1.length(), str2.length());
        String str = str1.substring(0,n);
         if (isDiv(str1, str) && isDiv(str2, str)) {
            return str;
        }
        return "";
    }
}