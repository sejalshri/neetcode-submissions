class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,maxLength=0,maxFreq=0;
        //for any substring formula would be : length(substring)-maxF<=k
        //we will have to mantain maxF;
        HashMap<Integer,Integer> map = new HashMap<>(26);

        while(r<s.length()){
            map.put(s.charAt(r)-'A',map.getOrDefault(s.charAt(r)-'A',0)+1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(r)-'A'));
            if((r-l+1)-maxFreq>k){
                map.put(s.charAt(l)-'A',map.get(s.charAt(l)-'A')-1);
                l++;
            }
            maxLength= Math.max(maxLength, r-l+1);
            r++;

        }
        return maxLength;
        
    }
}
