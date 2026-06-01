class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length + 1]; 
        for(int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int count = entry.getValue();
            if(buckets[count] == null) {
                buckets[count] = new ArrayList<>();
            }
            buckets[count].add(entry.getKey());
        }
        List<Integer> resList = new ArrayList<>();
        for(int i = buckets.length - 1; i >= 0 && resList.size() < k; i--) {
            if(buckets[i] != null) {
                for(int element : buckets[i]) {
                    resList.add(element);
                    if(resList.size() == k) break;
                }
            }
        }
        int[] result = new int[resList.size()];
        for(int i = 0; i < k; i++) {
            result[i] = resList.get(i);
        }
        return result;
    }
}
