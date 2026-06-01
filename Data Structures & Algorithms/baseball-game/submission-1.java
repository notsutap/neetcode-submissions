class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String str : operations) {
            if(str.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            }
            else if(str.equals("D")) {
                stack.push(stack.peek() * 2);
            }
            else if(str.equals("C")) {
                stack.pop();
            }
            else {
                stack.push(Integer.parseInt(str));
            }
        }
        int score = 0;
        for(int st : stack) {
            score += st;
        }
        return score;
    }
}