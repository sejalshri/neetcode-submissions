class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> res = new HashMap<>();
        for(String s : strs){
            char[] arr = new char[26];
            for(char c : s.toCharArray()){
                arr[c-'a']++;
            }
            String key = Arrays.toString(arr);
            List<String> value = res.getOrDefault(key,new ArrayList<>());
            value.add(s);
            res.put(key,value);
        }
        return new ArrayList<>(res.values());
    }
}
