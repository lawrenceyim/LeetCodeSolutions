class Solution {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> duplicates = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!duplicates.contains(nums[i])) {
                duplicates.add(nums[i]);
            } else if (duplicates.contains(nums[i])) {
                duplicates.remove(duplicates.indexOf(nums[i]));
            }
        }
        return duplicates.get(0);
    }
}