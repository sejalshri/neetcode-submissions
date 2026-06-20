class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            queue.offer(new int[]{entry.getKey(), entry.getValue()});
            if(queue.size()>k){
                queue.poll();
            }
        }
        int[] ans = new int[k];
        for(int i=k-1;i>=0;i--){
            ans[i]=queue.poll()[0];
        }
        return ans;
    }
}
