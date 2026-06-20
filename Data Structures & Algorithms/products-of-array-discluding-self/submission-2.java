class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int prod=1;
        if(Arrays.stream(nums).filter(i->i==0).count()>1){
            return ans;
        }
        int zeroIndex = -1;
        for(int i = 0 ; i<nums.length;i++){
            if(nums[i]!=0){
                prod=prod*nums[i];
            }
            else{
                zeroIndex=i;
            }
        }
        if(!(zeroIndex==-1)){
            ans[zeroIndex]=prod;
        }
        else{
            for(int i =0;i<nums.length;i++){
                ans[i] = prod/nums[i];
            }
        }
        return ans;
        
    }
}  
