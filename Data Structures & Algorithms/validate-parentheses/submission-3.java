class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> st = new ArrayDeque<>();
        char[] brackets = s.toCharArray();
        for (char br : brackets) {
            if (br == '(' || br == '{' || br == '[') {
                st.push(br);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                if (br == ')' && top != '(' || br == '}' && top != '{' || br == ']' && top != '[')
                    return false;
            }
        }
        return st.isEmpty();
    }
}
