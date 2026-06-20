class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int l=0;
        int[] output = new int[nums.length-k+1];
        if(k==1){
            return nums;
        }
        for(int r=0;r<nums.length;r++){
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[r]){
                dq.pollLast();
            }
            dq.offerLast(r);
            if(dq.peekFirst()<l){
                dq.pollFirst();
            }
            if(r+1>=k){
                output[l] = nums[dq.peekFirst()];
                l++;
            }
        }
        return output;   
    }
}
