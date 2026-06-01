class Solution {
    public boolean isPalindrome(String s) {
        String word="";
        s = s.toLowerCase();
        char[] sArr = s.toCharArray();
        
        for(char ch : sArr) {
            if(Character.isLetterOrDigit(ch)){
                word = word + ch;
            } 
        }
        // System.out.println(word);
        int i = 0, j = word.length() - 1;
        while(i < j && i <= word.length() - 1 && j >= 0) {
            if(word.charAt(i) != word.charAt(j)) {
                System.out.println(i + " " + j);
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
