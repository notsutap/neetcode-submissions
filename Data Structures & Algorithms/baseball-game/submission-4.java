class Solution {
    public int calPoints(String[] operations) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int res = 0;
        for(String op : operations) {
            if(op.equals("+")) {
                int top = stack.poll();
                int newTop = stack.peek() + top;
                stack.push(top);
                stack.push(newTop);
                res += newTop;
            } else if(op.equals("C")) {
                res -= stack.poll();
            } else if(op.equals("D")) {
                stack.push(stack.peek() * 2);
                res += stack.peek();
            } else {
                stack.push(Integer.parseInt(op));
                res += stack.peek();
            } 
        }
        return res;
    }
}