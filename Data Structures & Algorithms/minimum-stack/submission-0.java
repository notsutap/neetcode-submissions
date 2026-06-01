class MinStack {
    private Deque<Integer> stack;
    public MinStack() {
        stack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int st : stack) {
            if(st < min) {
                min = st;
            }
        }
        return min;
    }
}
