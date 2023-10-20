import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store the elements and their indices
        Map<Integer, Integer> numMap = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the difference between the target and the current element
            int diff = target - nums[i];
            
            // Check if the difference is present in the hash map
            if (numMap.containsKey(diff)) {
                // If it is, return the indices of the current element and the difference
                return new int[]{numMap.get(diff), i};
            }
            
            // Add the current element to the hash map
            numMap.put(nums[i], i);
        }
        
        // If no solution is found, return an empty array
        return new int[]{};
    }
}
