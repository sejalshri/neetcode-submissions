class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> index = new HashMap<>();
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            if(index.containsKey(target-nums[i])){
                ans[0]= index.get(target-nums[i]);
                ans[1] = i;
                return ans;
            }
            index.put(nums[i],i);
        }
        return ans;
    }
}
