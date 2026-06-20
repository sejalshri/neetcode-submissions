class MinStack {
    private int min = Integer.MAX_VALUE;
    private Deque<Integer> temp = new ArrayDeque<>();
    Deque<Integer> stack;

    public MinStack() {
        stack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(min>val){
            min = val;
        }
    }
    
    public void pop() {
        if(!stack.isEmpty() && stack.peek()==min){
            stack.pop();
            min = Integer.MAX_VALUE;
            while(!stack.isEmpty()){
                min = Math.min(min, stack.peek());
                temp.push(stack.peek());
                stack.pop();
            }
            while(!temp.isEmpty()){
                stack.push(temp.peek());
                temp.pop();
            }
        }
        else{
            stack.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}
