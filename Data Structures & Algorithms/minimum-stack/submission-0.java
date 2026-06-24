class MinStack {

    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.addFirst(val);
        if(minStack.isEmpty() || minStack.peekFirst() >= val){
            minStack.addFirst(val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        int pop = stack.removeFirst();
        if(minStack.peekFirst() == pop) minStack.removeFirst();
    }
    
    public int top() {
        return stack.peekFirst(); 
    }
    
    public int getMin() {
        return minStack.peekFirst();
    }
}
