class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();

        List<String> first = new ArrayList<>();
        first.add(strs[0]);
        ans.add(first);

        for(int i = 1; i < strs.length; i++) {

            boolean isAnagram = false;

            for(int j = 0; j < ans.size(); j++) {

                List<String> group = ans.get(j);

                if(isAnagram(strs[i],
                        group.get(group.size() - 1))) {

                    group.add(strs[i]);
                    isAnagram = true;
                    break;
                }
            }

            if(!isAnagram) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(strs[i]);
                ans.add(newGroup);
            }
        }

        return ans;
    }

    boolean isAnagram(String a, String b) {

        if(a.length() != b.length()) {
            return false;
        }

        int[] arr = new int[26];

        for(int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 'a']++;
            arr[b.charAt(i) - 'a']--;
        }

        for(int x : arr) {
            if(x != 0) {
                return false;
            }
        }

        return true;
    }
}