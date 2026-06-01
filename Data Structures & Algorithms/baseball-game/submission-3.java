class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        int score = 0;
        for (String st : operations) {
            if (st.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
                score += newTop;
            } else if (st.equals("D")) {
                stack.push(stack.peek() * 2);
                score += stack.peek();
            } else if (st.equals("C")) {
                score -= stack.pop();
            } else {
                stack.push(Integer.parseInt(st));
                score += stack.peek();
            }
        }
        return score;
    }
}