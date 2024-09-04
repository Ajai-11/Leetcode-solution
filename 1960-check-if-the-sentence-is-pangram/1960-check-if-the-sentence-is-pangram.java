class Solution {
    public boolean checkIfPangram(String sentence) {
        int ref=0;
        int pos=0;
        char[] copy =sentence.toCharArray();
        int len=sentence.length();
        for(int i=0;i<len;i++){
            pos=(copy[i]-'a');
            ref=ref|(1<<pos);
        }
        return (ref==(1<<26)-1);
    }
}