class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] tempo = new int[temp.length];
        int[] ans = new int[temp.length];
        for(int i=temp.length-1;i>=0;i--){
            while(!stack.isEmpty() && temp[stack.peek()]<=temp[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                tempo[i]=i;
                stack.push(i);
            }
            else if(temp[stack.peek()]>temp[i]){
                tempo[i]=stack.peek();
                stack.push(i);
            }
        }

        for(int i=0;i<temp.length;i++){
            ans[i]=tempo[i]-i;
        }
        return ans;
        
    }
}
