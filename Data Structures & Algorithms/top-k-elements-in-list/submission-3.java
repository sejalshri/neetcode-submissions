class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        List<List<Integer>> bucket = new ArrayList<>();
         for (int i = 0; i <= nums.length; i++) {
            bucket.add(new ArrayList<>());
        }
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            int index = entry.getValue();
            bucket.get(index).add(entry.getKey());
        }
        int count=0;
        int[] ans = new int[k];
        for(int i=bucket.size()-1;i>=0;i--){
            if(bucket.get(i)!=null){
                for(int j=0;j<bucket.get(i).size();j++){
                    ans[count++]=bucket.get(i).get(j);
                }
                if(count==k){
                    break;
                }
            }
        }
        return ans;
    }
}
