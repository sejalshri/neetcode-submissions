class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        List<Integer> arr = new ArrayList<>(freq.keySet());
        arr.sort((a, b) -> freq.get(b) - freq.get(a));
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}
