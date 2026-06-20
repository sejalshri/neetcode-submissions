class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        int res=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }

        int l=0,r=max;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(comp(piles,mid)>h){
                l=mid+1;
            }
            else if(comp(piles,mid)<=h){
                res=mid;
                r=mid-1;
            }
        }
        return res; 
    }

    private long comp(int[] piles,int k){
        long time=0;
        for(int p:piles){
            time+=Math.ceil((double)p/k);
        }
        return time;
    }
}
