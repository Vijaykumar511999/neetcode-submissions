class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count frequency of each element using HashMap
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Create buckets where index = frequency
        // Maximum possible frequency is nums.length
        List<Integer>[] buckets = new List[nums.length + 1];
        
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        
        // Step 3: Place elements in buckets based on their frequency
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            buckets[freq].add(num);
        }
        
        // Step 4: Traverse buckets from high to low frequency
        int[] result = new int[k];
        int index = 0;
        
        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
            for (int num : buckets[i]) {
                result[index++] = num;
                if (index == k) break;
            }
        }
        
        return result;

    }
}
