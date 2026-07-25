class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int freqS[] = new int[26];
        int freqT[] = new int[26];
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();
        for(char sChar : sArray) {
            freqS[sChar - 'a']++;
        }
        for(char tChar : tArray) {
            freqT[tChar - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(freqT[i] != freqS[i]) return false;
        }
        return true;
    }
}
