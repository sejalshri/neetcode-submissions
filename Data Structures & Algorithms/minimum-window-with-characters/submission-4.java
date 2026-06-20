class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

        String ans = "";
        int l = 0, r = 0, minLength = 10001;

        Set<Character> set = new HashSet<>();
        HashMap<Character,Integer> map = new HashMap<>();

        for (char ch : t.toCharArray()) {
            set.add(ch);
            map.put((Character)ch,map.getOrDefault((Character)ch,0)+1);
        }
        int count=0;
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                if(map.get((Character)s.charAt(r))>0){
                    count++;
                }
                map.put((Character)s.charAt(r),map.get((Character)s.charAt(r))-1);
            }
            while(count==t.length()){
                if(r-l+1<minLength){
                    minLength=r-l+1;
                    ans=s.substring(l,r+1);
                }
                if(map.containsKey((Character)s.charAt(l))){
                    map.put((Character)s.charAt(l),map.get((Character)s.charAt(l))+1);
                     if(map.get((Character)s.charAt(l))>0){
                        count--;
                    }
                }
                l++;
            }
            r++;
        }
        return ans;
        
    }
}
