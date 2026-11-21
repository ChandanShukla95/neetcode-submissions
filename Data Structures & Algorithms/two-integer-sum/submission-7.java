class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numToIndex = new HashMap<>();
        
        // 1. Iterate over every number in the array
        for (int i = 0; i < nums.length; i++) {
            // 2. Calculate the complement that would sum to our target
            int complement = target - nums[i];
            
            // 3. Check if that complement is in our hash table
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }
            
            // 4. Add the current number to our hash table
            numToIndex.put(nums[i], i);
        }
        
        // If no solution found, return an empty array
        return new int[]{};
    }
}