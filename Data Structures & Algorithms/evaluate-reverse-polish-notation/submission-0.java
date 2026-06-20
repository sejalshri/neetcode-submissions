class Solution {
    public int evalRPN(String[] tokens) {
        int ans = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                ans = stack.pop()+stack.pop();
                stack.push(ans);
            }
            else if(tokens[i].equals("-")){
                int b=stack.pop();
                ans = stack.pop()-b;
                stack.push(ans);
            }
            else if(tokens[i].equals("*")){
                ans = stack.pop()*stack.pop();
                stack.push(ans);
            }
            else if(tokens[i].equals("/")){
                int b=stack.pop();
                ans = stack.pop()/b;
                stack.push(ans);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return !stack.isEmpty()?stack.peek():0;
        
    }
}
