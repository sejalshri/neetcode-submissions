class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }

        //sliding window frequency matching
        int[] map1 = new int[26];
        int[] map2 = new int[26];

        for(int i=0;i<s1.length();i++){
            map1[s1.charAt(i)-'a']++;
            map2[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(map1,map2)){
            return true;
        }

        for(int i=s1.length();i<s2.length();i++){
            map2[s2.charAt(i)-'a']++;
            map2[s2.charAt(i-s1.length())-'a']--;

            if(Arrays.equals(map1,map2)){
                return true;
            }
        }
        return false;
    }
    
}
