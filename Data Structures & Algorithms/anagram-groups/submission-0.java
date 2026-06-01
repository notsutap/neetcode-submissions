class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<String> list;
        for(String str : strs) {
            int freq[] = new int[26];
            char[] strArr = str.toCharArray();
            for(char c : strArr) {
                freq[c - 'a']++;
            }
            String freqString = Arrays.toString(freq);
            list = map.getOrDefault(freqString, new ArrayList<>());
            list.add(str);
            map.put(freqString, list);
        }
        return new ArrayList<>(map.values());
    }
}
