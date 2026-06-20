class Solution {
    public int longestConsecutive(int[] arr) {
        if(arr.length==0){
            return 0;
        }
        Arrays.sort(arr);
        int count = 1;
        int ans = 1;
        for(int i=1;i<arr.length;i++){
            if(Math.abs(arr[i]-arr[i-1])==1){
                count++;
                ans  = Math.max(count, ans);
            }
            else if(arr[i]-arr[i-1]==0){
                continue;
            }
            else{
                count=1;
            }
        }
        return ans;
    }
}
