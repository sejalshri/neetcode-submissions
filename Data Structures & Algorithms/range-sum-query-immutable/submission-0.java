class NumArray {
    int[] prefSum;

    public NumArray(int[] nums) {
        prefSum = new int[nums.length];
        int sum=0;
        for(int i=0;i<prefSum.length;i++){
            sum+=nums[i];
            prefSum[i]=sum;
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return prefSum[right];
        }
        return prefSum[right]-prefSum[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */