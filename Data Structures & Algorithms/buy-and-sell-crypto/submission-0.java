class Solution {
    public int maxProfit(int[] prices) {
        int maxElement = prices[prices.length-1];
        int ans = Integer.MIN_VALUE;
        for(int i=prices.length-1;i>=0;i--){
            ans = Math.max(ans, maxElement - prices[i]);
            maxElement = Math.max(maxElement, prices[i]);
        }
        return ans;
        
    }
}
