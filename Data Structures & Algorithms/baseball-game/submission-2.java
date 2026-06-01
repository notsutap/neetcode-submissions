class Solution {
    public int calPoints(String[] operations) {
        int res = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for(String str : operations) {
            if(str.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
                res += newTop;
            }
            else if(str.equals("D")) {
                stack.push(stack.peek() * 2);
                res += stack.peek();
            }
            else if(str.equals("C")) {
                res -= stack.pop();
            }
            else {
                stack.push(Integer.parseInt(str));
                res += stack.peek();
            }
        }
        return res;
    }
}