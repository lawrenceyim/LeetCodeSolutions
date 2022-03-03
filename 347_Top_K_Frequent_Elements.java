class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            numbers.put(nums[i], numbers.getOrDefault(nums[i], 0) + 1);
        }        
        int[] modes = new int[k];
        for (int i = 0; i < k; i++) {
            int max = Collections.max(numbers.values());
            for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
                if (entry.getValue() == max) {
                    modes[i] = entry.getKey();
                    numbers.remove(entry.getKey());
                    break;
                }
            }
        }
        return modes;
    }
}