class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0, r = s.length() - 1;
        while (l < r) {
            char ch1 = s.charAt(l);
            char ch2 = s.charAt(r);
            if (!Character.isLetterOrDigit(ch1))
                l++;
            else if (!Character.isLetterOrDigit(ch2))
                r--;
            else {
                if (ch1 != ch2) {
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
    }
}
