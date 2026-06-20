class Solution {
    public void sortColors(int[] nums) {
        int[] bucket = new int[3];
        for (int i = 0; i < nums.length; i++) {
            bucket[nums[i]]++;
        }
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            if (l<3 && bucket[l] == 0) {
                l++;
            }
            if (bucket[l] != 0) {
                nums[i] = l;
                bucket[l]--;
            }
        }
    }
}