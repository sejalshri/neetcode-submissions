class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> count = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            count.put(s.charAt(i),count.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            if(!count.containsKey(t.charAt(i))){
                return false;
            }
            count.put(t.charAt(i), count.get(t.charAt(i))-1);
            if(count.get(t.charAt(i))==0){
                count.remove(t.charAt(i));
            }
        }
        return count.isEmpty();

    }
}
