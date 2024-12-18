class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap <Character,String> h1 = new HashMap<>();
        HashMap <String,Character> h2 = new HashMap<>();
        String str[] = s.split(" ");
        char p[] = pattern.toCharArray();
        if(str.length != p.length)
            return false;

        for(int i = 0;i<p.length ;i++)
        {
            if(h1.containsKey(p[i]))
            {
                if(h1.get(p[i]).compareTo(str[i]) != 0)
                    return false;
            }
            else
            {
                if(h2.containsKey(str[i]))
                {
                    return false;
                }
                else
                {
                    h1.put(p[i],str[i]);
                    h2.put(str[i],p[i]);
                }       
            }
        }
        return true;
    }
}