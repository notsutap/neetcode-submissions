class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;
    int minTop;
    public MinStack() {
        stack = new ArrayDeque();
        minStack = new ArrayDeque();
    }
    
    public void push(int val) {
        if(!minStack.isEmpty()) {
            int temp = Math.min(val, minStack.peek());
            minStack.push(temp);
        } else {
            minStack.push(val);
        }
        
        stack.push(val);
    }
    
    public void pop() {
        minStack.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
